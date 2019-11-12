package com.techlab.basicsofjava;

public class AnonymousObject {
	int x = 10;

	public void display() {
		System.out.println("Hello 1");
	}

	public static void main(String args[]) {
		System.out.println(new AnonymousObject().x);
		System.out.println(new AnonymousObject().x);
		System.out.println(new AnonymousObject().x);
		new AnonymousObject().display();
		new AnonymousObject().display();
	}
}
