package com.mahendra;

public class Main {

	public static void main(String[] args) {
		Greeting gt = new Greeting();
		gt.greet("Mahendra");
		for(int i=1;i<11; i++) {
			gt.greet("User "+ i);
		}
	}
}
