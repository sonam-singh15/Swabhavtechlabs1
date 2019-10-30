package com.techlabs.rectangle;

public class Rectangle {

	private int height;
	private int width;

	public int getHeight() {

		return height;
	}

	public void setheight(int newheight) {

		if (newheight < 0) {
			newheight = 1;
			System.out.println("you are using an negative number,it will be reset to 1");
		} else
			newheight = 100;
		height = newheight;
	}

	public int getwidth() {
		return width;
	}

	public void setwidth(int newwidth) {

		if (newwidth < 0) {
			newwidth = 1;
			System.out.println("you are using an negative number,it will be reset to 1");
		} else
			newwidth = 100;
		width = newwidth;
	}

	public int calculateArea() {
		int area = height * width;
		return area;
	}

}

