package com.thoughtfocus.arrays.montharray;

public class Calender {
	public static void main(String[] args) {
		Months month=new Months();
		month.save("January");
		month.save("Feburary");
		month.save("March");
		month.save("April");
		month.save("May");
		month.save("June");
		month.save("July");
		month.save("August");
		month.save("September");
		month.save("October");
		month.save("November");
		month.save("December");
		month.printAll();
		month.delete("January");
		System.out.println("DELETING MONTH");
		month.printAll();
	}

}
