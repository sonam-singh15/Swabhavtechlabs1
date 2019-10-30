package com.techlabs.rectangletest;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		System.out.println("small rectangle details are");
		small.setheight(-6);
		small.setwidth(400);
		System.out.println("height " + small.getHeight());
		System.out.println("width " + small.getwidth());
		System.out.println("area of small rectangle " + small.calculateArea());
		Rectangle big = new Rectangle();
		System.out.println("big rectangle details are");
		big.setheight(100);
		big.setwidth(400);
		System.out.println("height " + big.getHeight());
		System.out.println("width " + big.getwidth());
		System.out.println("area of big rectangle" + big.calculateArea());

	}

}
