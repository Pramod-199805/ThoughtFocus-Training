package com.thoughtfocus.methodoveride.usingobjects;

public class Call {
	public static void main(String[] args) {
		Friend friend =new Friend();
		Unknown unknown=new Unknown();
		Human human=new Human();
		human.speak(friend);
		human.speak(unknown);
	}

}
