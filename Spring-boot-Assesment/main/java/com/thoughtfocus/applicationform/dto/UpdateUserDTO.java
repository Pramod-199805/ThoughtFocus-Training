package com.thoughtfocus.applicationform.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Getter
@Setter
@ToString
public class UpdateUserDTO {

	private String email;
	private String password;

}
