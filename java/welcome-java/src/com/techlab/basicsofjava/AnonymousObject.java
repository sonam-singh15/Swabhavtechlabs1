package com.techlab.basicsofjava;

public class AnonymousObject {
	int x = 10;

	public void display() {
		System.out.println("Hello 1");
	}

	public static void main(String args[]) {

		AnonymousObject a1;
		AnonymousObject a2, a3;
		// System.out.println(a.x);

		a1 = new AnonymousObject();
		System.out.println(a1.x);
		System.out.println(a1.hashCode());

		a2 = a1;
		System.out.println(a2.x);
		System.out.println(a2.hashCode());

		System.out.println(new AnonymousObject().x);
		System.out.println(new AnonymousObject().x);
		System.out.println(new AnonymousObject().x);

		new AnonymousObject().display();
		new AnonymousObject().display();
	}
}
