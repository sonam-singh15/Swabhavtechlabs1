package com.techlab.rectangletest;

import com.techlab.rectangle.Rectangle;

public class RectangleRefTest {
	public static void main(String[] args) {

		Rectangle r1 = new Rectangle();

		r1.setheight(10);
		r1.setwidth(50);
		r1.setcolor("ReD");

		System.out.println("height of r1 :- " + r1.getHeight());
		System.out.println("width of r1:- " + r1.getwidth());
		System.out.println("Color of r1 is:- " + r1.getcolor());

		Rectangle temp = r1;
		//temp.setcolor("blue");
		//temp.setwidth(100);
		System.out.println(temp.hashCode());
		System.out.println(r1.hashCode());

		System.out.println("Color of temp  is:- " + temp.getcolor());
		System.out.println("width of temp:- " + temp.getwidth());

	}
}
