package com.thoughtfocus.applicationform.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;
import com.thoughtfocus.applicationform.exception.LoginDataNullException;
import com.thoughtfocus.applicationform.service.LoginService;

@RestController
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	LoginService loginService;

	@GetMapping("/login")
	public RegisterFormEntity getLoginData(@RequestParam String email, @RequestParam String password) {

		RegisterFormEntity entity = null;
		try {
			if ((email != null && email != " ") && (password != null)) {
				entity = loginService.validateLoginData(email, password);
				if (entity != null) {
					logger.info("Logged In Sucesullyy!!!");
				} else {
					logger.info("User Not Found");
				}
			} else {
				logger.info("Details Cannot Be Empty");
				throw new LoginDataNullException("User Name and Password Cannot be Empty");
			}

		} catch (Exception e) {
			logger.error(e.getMessage());

		}
		return entity;

	}

}
