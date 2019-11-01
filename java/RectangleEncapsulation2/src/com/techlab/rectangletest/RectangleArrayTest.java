package com.techlab.rectangletest;

import com.techlab.rectangle.Rectangle;

public class RectangleArrayTest {
	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[3];
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		Rectangle r3 = new Rectangle();

		rectangles[0] = r1;
		rectangles[1] = r2;
		rectangles[2] = r3;

		r1.setheight(10);
		r1.setwidth(50);
		r1.setcolor("ReD");

		r2.setheight(100);
		r2.setwidth(5);
		r2.setcolor("Blue");

		r3.setheight(10);
		r3.setwidth(7);
		r3.setcolor("green");

		RectangleTestPrintInfo.printInfo(rectangles);

	}

}
