package com.thoughtfocus.jdbc.exception;

public class InvalidSerialNumberException extends RuntimeException {
	
	public void message() {
		System.out.println("Serial Number Doesnot exists");
	}

}
