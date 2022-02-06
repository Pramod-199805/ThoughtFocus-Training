package com.thoughtfocus.applicationform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thoughtfocus.applicationform.entity.RegisterFormEntity;

public interface ApplicationFormRepository extends JpaRepository<RegisterFormEntity, Integer> {
	
	public RegisterFormEntity  getByEmail(String email);
	
	public RegisterFormEntity getDetailsByEmailAndPassword(String email,String password);
	
	

}

