package com.thoughtfocus.applicationform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtfocus.applicationform.dto.UpdateUserDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.service.UpdateUserPasswordService;

@RestController
public class ForgotPasswordController {

	private static Logger logger = LoggerFactory.getLogger(ForgotPasswordController.class);

	@Autowired
	private UpdateUserPasswordService updateService;

	@PostMapping("/updatePassword")
	public String getUpdateDetails(@RequestBody UpdateUserDTO updateUserDTO) {

		try {
			if (updateUserDTO.getEmail() != null && updateUserDTO.getPassword() != null) {

				RegisterFormEntity entity = updateService.validateUpdateDetails(updateUserDTO);
				if (entity != null) {
					logger.info("Password Updated Sucessfully For EmaiLId" + updateUserDTO.getEmail());
				} else {
					logger.info("No Email Found");
					return "Password Not Updated";
				}

			} else {
				logger.warn("Update Credentials Cannot Be Empty");
			}
		} catch (NullPointerException e) {
			e.printStackTrace();

		}
		return "Password Updated Sucessfully";

	}

}
