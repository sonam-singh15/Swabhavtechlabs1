package com.techlab.rectangletest;

import com.techlab.rectangle.Rectangle;

public class RectangleTest {

	public static void main(String[] args) {

		Rectangle small = new Rectangle();
		System.out.println("small rectangle details are:-");
		small.setheight(-5);
		small.setwidth(6);
		small.setcolor("ReD");

		System.out.println("Color is:- " + small.getcolor());
		System.out.println("height:- " + small.getHeight());
		System.out.println("width:- " + small.getwidth());
		System.out.println("area of small rectangle:- " + small.calculateArea());
		System.out.println("\n");

	

	}

}
