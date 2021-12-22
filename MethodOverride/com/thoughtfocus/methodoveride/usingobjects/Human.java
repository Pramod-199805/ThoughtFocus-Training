package com.thoughtfocus.methodoveride.usingobjects;

public class Human {
	public void speak(Friend fr) {
	fr.person();
	System.out.println("Speakin with friend");
	}
	public void speak(Unknown unknown) {
		System.out.println("speaking with unknown");
	}

}
