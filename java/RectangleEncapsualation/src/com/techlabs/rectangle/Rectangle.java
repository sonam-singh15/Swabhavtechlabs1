package com.techlabs.rectangle;

public class Rectangle {

	private int height;
	private int width;

	public int getHeight() {

		return height;
	}

	public void setheight(int newheight) {

		int m = checkRangeOfRectangle(newheight);height = m;
	}

	public int getwidth() {
		return width;
	}

	public void setwidth(int newwidth) {

		int m = checkRangeOfRectangle(newwidth);width = m;

	}

	public int checkRangeOfRectangle(int dimension) {
		if (dimension < 0) {
			dimension = 1;
		} else
			dimension = 100;
		return dimension;
	}

	public int calculateArea() {
		int area = height * width;return area;
	}

}
