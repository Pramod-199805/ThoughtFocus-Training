package com.thoughtfocus.applicationform.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="Application_Form_Details")
public class RegisterFormEntity {
	@Id
	@Column(name="S_No")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String userName;
	private String email;
	private String password;
	private long mobileNumber;
	private String place;

}
