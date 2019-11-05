 package com.techlab.basic;

import com.techlab.rectangle.Rectangle1;

public class Rectangle1test {

	public static void main(String[] args) {

		Rectangle1 small = new Rectangle1();
		System.out.println("small rectangle details are:-");
		small.setheight(-5);
		small.setwidth(6);
		small.setcolor("BLACK");

		System.out.println("Color is:- " + small.getcolor());
		System.out.println("height:- " + small.getHeight());
		System.out.println("width:- " + small.getwidth());
		System.out.println("area of small rectangle:- " + small.calculateArea());
		System.out.println("\n");

	

	}

}
