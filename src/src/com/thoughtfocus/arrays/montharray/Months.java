package com.thoughtfocus.arrays.montharray;

public class Months {
	String[] month = new String[12];
	int index = 0;

	public void printAll() {
		for (int i = 0; i < month.length; i++) {
			System.out.println(month[i]);
			
		}
	}

	public boolean save(String addMonth) {
		if (index < 12) {
			month[index] = addMonth;
			index++;
		}
		return false;
	}

	public String delete(String enterMonth) {
		for (int i = 0; i < month.length; i++) {
			if (month[i].equals(enterMonth)) {
				month[i] = null;
				return "Month Deleted";
			}

		}
		return "Not deleted";
	}
}
