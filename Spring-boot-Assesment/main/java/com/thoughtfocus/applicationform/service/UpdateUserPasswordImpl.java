package com.thoughtfocus.applicationform.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thoughtfocus.applicationform.dto.UpdateUserDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.exception.InvalidEmailIdException;
import com.thoughtfocus.applicationform.repository.ApplicationFormRepository;

@Service
public class UpdateUserPasswordImpl implements UpdateUserPasswordService {

	private static Logger logger = LoggerFactory.getLogger(UpdateUserPasswordImpl.class);
	@Autowired
	ApplicationFormRepository repository;

	@Override
	public RegisterFormEntity validateUpdateDetails(UpdateUserDTO updateUserDTO) {

		RegisterFormEntity entity = null;
		try {
			if ((updateUserDTO.getEmail().endsWith("@gmail.com") && (updateUserDTO.getPassword().length() > 8))) {
				entity = repository.getByEmail(updateUserDTO.getEmail());
				if (entity != null) {
					entity.setPassword(updateUserDTO.getPassword());
					repository.save(entity);
					logger.info("Password Updated And  Saved Sucessfully");
				} else {
					logger.info("No EmailID Found");
				}

			} else {
				logger.warn("Invalid Credentials Password length must be greater than 8 And Email must end with @gmail.com");
				throw new InvalidEmailIdException("Invalid Update Credentials");

			}

		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		return entity;
	}

}
