package com.thoughtfocus.exceptionhandling;

public class ArraysOutOfIndex {
	static int[] age = new int[3];
	static int index = 0;

	public static void addAges(int number) {
		if (index < 3)
			age[index] = number;
		index++;
	}

	public static void getAge() {
		try {
			System.out.println(age[4]);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		addAges(23);
		addAges(24);
		addAges(25);
		addAges(26);
		getAge();
	}

}
