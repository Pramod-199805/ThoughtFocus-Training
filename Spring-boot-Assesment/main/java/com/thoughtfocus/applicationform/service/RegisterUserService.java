package com.thoughtfocus.applicationform.service;

import com.thoughtfocus.applicationform.dto.RegisterUserDTO;

public interface RegisterUserService {
	public boolean ValidateRegisterData(RegisterUserDTO registerUserDTO);

}
