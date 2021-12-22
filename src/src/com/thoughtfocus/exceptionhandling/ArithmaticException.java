package com.thoughtfocus.exceptionhandling;

import java.util.Scanner;

public class ArithmaticException {
	public static void main(String[] args) {
		int x = 4;
		int y = 0;
		try {
			int division = x / y;
			System.out.println("Division: " + division);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
