package com.org.Variables;

public class InstanceVar {
	int age;
	public static void main(String[] args) {
		InstanceVar v1=new InstanceVar();
		InstanceVar v2=new InstanceVar();
		v1.age=20;
		System.out.println("V1: "+v1.age+ " V2: "+v2.age);
		
		
	}

}
