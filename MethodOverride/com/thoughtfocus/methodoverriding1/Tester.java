package com.thoughtfocus.methodoverriding1;

public class Tester {
	public static void main(String[] args) {
		Dog dog=new Dog();
		Animal animal=new Dog();//If in Dog class speak() not present then speak method in Animal class will be printed
		animal.speak();
		animal.eat();
		dog.speak();
	}

}
