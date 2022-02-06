package com.thoughtfocus.applicationform.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class RegisterUserDTO {
	
	private String userName;
	private String email;
	private String password;
	private String confirmPassword;
	private long mobileNumber;

}
