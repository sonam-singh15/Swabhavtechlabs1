package com.techlab.rectangletest;

import com.techlab.rectangle.Rectangle;

public class RectangleTestPrintInfo {
	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.setheight(10);
		r1.setwidth(50);
		r1.setcolor("ReD");
		printInfo(r1);

		Rectangle r2 = new Rectangle();
		r2.setheight(100);
		r2.setwidth(5);
		r2.setcolor("Blue");
		printInfo(r2);

	}

	public static void printInfo(Rectangle r) {
		System.out.println("height of r :- " + r.getHeight());
		System.out.println("width of r:- " + r.getwidth());
		System.out.println("Color of r :- " + r.getcolor());
		System.out.println("area is :" + r.calculateArea());
		System.out.println(r.hashCode());

	}

	public static void printInfo(Rectangle[] rectangles) {
		for (Rectangle rect : rectangles) {
			printInfo(rect);
		}

	}

}
