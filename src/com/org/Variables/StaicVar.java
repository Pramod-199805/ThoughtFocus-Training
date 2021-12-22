package com.org.Variables;

public class StaicVar {
	static int age;
	public static void main(String[] args) {
		StaicVar v1=new StaicVar();
		StaicVar v2=new StaicVar();
		v1.age=10;
		v1.age=30;
		System.out.println("V1: "+v1.age+" V2: "+v2.age);
		//v1.age=20;
	}

}
