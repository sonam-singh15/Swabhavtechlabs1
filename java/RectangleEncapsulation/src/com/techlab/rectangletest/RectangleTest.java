package com.techlab.rectangletest;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle small = new Rectangle();
		System.out.println("small rectangle details are:-");
		small.setheight(-5);
		small.setwidth(600);

		System.out.println("height:- " + small.getHeight());
		System.out.println("width:- " + small.getwidth());
		System.out.println("area of small rectangle:- " + small.calculateArea());
		System.out.println("\n");

		Rectangle big = new Rectangle();
		System.out.println("big rectangle details are:");
		big.setheight(700);
		big.setwidth(500);

		System.out.println("height:- " + big.getHeight());
		System.out.println("width:- " + big.getwidth());
		System.out.println("area of big rectangle:- " + big.calculateArea());

	}

}
