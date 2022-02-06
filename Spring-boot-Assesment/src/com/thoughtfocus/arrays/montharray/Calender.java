package com.thoughtfocus.arrays.montharray;

public class Calender {
	public static void main(String[] args) {
		Months month=new Months();
		month.save("Jan");
		month.save("Feb");
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
		System.out.println("DELETE METHOD");
		System.out.println(month.delete("January"));
		System.out.println(month.delete("Feburary"));
		System.out.println(month.delete("December"));
		
		System.out.println("UPDATE METHOD");
		month.update("Jan", "January");
		month.update("Feb", "Feburary");
		month.printAll();
	}

}
