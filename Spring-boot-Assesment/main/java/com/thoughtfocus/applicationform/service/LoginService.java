package com.thoughtfocus.applicationform.service;

import com.thoughtfocus.applicationform.entity.RegisterFormEntity;

public interface LoginService {
	
	public RegisterFormEntity validateLoginData(String email,String password);

}
