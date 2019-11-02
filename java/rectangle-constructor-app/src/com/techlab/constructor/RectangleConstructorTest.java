package com.techlab.constructor;

public class RectangleConstructorTest {
	public static void main(String[] args) {
		RectangleConstructor r1 = new RectangleConstructor(10, 5);
		printInfo(r1);
		printInfo(new RectangleConstructor(20, 30));

	}

	public static void printInfo(RectangleConstructor r) {
		System.out.println("height of r :- " + r.getHeight());
		System.out.println("width of r:- " + r.getwidth());
		System.out.println("area is :" + r.calculateArea());
		System.out.println(r.hashCode());
	

	}

}
