package com.thoughtfocus.assesmenttwo.initialization;

public class ValueInitialization {
int age;
String name;
long phoneNumber;
String dateOfBirth="05 April,1998";//Litteral Way 
//Byb Using Constructors
public ValueInitialization(String name, long phoneNumber) {
	this.name = name;
	this.phoneNumber = phoneNumber;
}
//Initializing local variable in Method
public void initializeValue(String address) {
	address="Dharwad";
	System.out.println(address);
}

public static void main(String[] args) {
	ValueInitialization initialize=new ValueInitialization("Pramod", 987654132l);
	initialize.age=23;//Initializing using object reference
	System.out.println(initialize.age);
}

}
