package com.thoughtfocus.applicationform.service;

import com.thoughtfocus.applicationform.dto.UpdateUserDTO;
import com.thoughtfocus.applicationform.entity.RegisterFormEntity;

public interface UpdateUserPasswordService {

	public RegisterFormEntity validateUpdateDetails(UpdateUserDTO updateUserDTO);

}
