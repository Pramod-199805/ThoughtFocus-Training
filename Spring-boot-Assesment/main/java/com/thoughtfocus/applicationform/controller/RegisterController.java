package com.thoughtfocus.applicationform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtfocus.applicationform.dto.RegisterUserDTO;
import com.thoughtfocus.applicationform.service.RegisterUserService;

@RestController
public class RegisterController {

	private static Logger logger = LoggerFactory.getLogger(RegisterController.class);
	@Autowired
	RegisterUserService registerUserService;

	@PostMapping("/register")
	public String getRegisterDetails(@RequestBody RegisterUserDTO registerDto) {

		try {
			if (registerDto != null) {

				boolean data = registerUserService.ValidateRegisterData(registerDto);
				if (data) {
					logger.info("Data Saved Sucessfully"+registerDto);
					return " Data Saved Sucessfully" ;
				} else {
					logger.info(" Data Not Saved");
				}

			}

		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		return "Data Not Saved";

	}

}
