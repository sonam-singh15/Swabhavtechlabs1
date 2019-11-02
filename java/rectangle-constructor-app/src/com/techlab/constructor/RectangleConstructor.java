package com.techlab.constructor;

public class RectangleConstructor {
	private int height;
	private int width;

	public RectangleConstructor(int newheight, int newwidth) {
		this.height = newheight;
		this.width = newwidth;
	}

	public int getHeight() {
		return height;
	}

	public int getwidth() {
		return width;
	}

	public int calculateArea() {
		int area = height * width;
		return area;
	}

}
