package com.techlab.rectangle;

public class Rectangle {
	private int height;
	private int width;
	private static final int START_RANGE=1;
	private static final int END_RANGE=100;

	public int getHeight() {
		return height;
	}

	public void setheight(int newheight) {

		int m = checkRangeOfRectangle(newheight);
		height = m;
	}

	public int getwidth() {
		return width;
	}

	public void setwidth(int newwidth) {

		int m = checkRangeOfRectangle(newwidth);
		width = m;

	}

	public int checkRangeOfRectangle(int dimension) {
		dimension = dimension < 0 ? START_RANGE :END_RANGE ;
		return dimension;

	}

	public int calculateArea() {
		int area = height * width;
		return area;
	}

}
