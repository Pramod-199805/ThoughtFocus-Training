package com.thoughtfocus.applicationform.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.exception.InvalidEmailIdException;
import com.thoughtfocus.applicationform.repository.ApplicationFormRepository;

@Service
public class LoginServiceImpl implements LoginService {

	private static Logger logger = LoggerFactory.getLogger(LoginServiceImpl.class);

	@Autowired
	ApplicationFormRepository repository;

	@Override
	public RegisterFormEntity validateLoginData(String email, String password) {

		RegisterFormEntity entity = null;
		try {
			if (email.endsWith("@gmail.com") && password != null) {
				entity = repository.getDetailsByEmailAndPassword(email, password);
				if (entity != null) {
					logger.info("User Data Found");
				}	
				else {
					logger.info("User Not Foud");	
				}
			} else {
				logger.info("Invalid Email ID");
				throw new InvalidEmailIdException("Enter mail Ending with @gmail.com");
			}

		} catch (Exception e) {
			logger.error(e.getMessage());
			return null;
		}

		return entity;
	}

}
