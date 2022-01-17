package com.thoughtfocus.jdbc.dao;

public class InvalidBrandNameException extends RuntimeException{
public void message() {
	System.out.println("Brand Doesnot Exists");
}
}
