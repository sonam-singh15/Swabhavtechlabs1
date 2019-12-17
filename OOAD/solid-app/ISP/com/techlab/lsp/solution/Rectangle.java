package com.techlab.lsp.solution;

public class Rectangle implements Polygon {
	protected int height;
	protected int width;

	public Rectangle(int height, int width) {
		this.height = height;
		this.width = width;

	}

	public int getHeight() {
		return this.height;

	}

	public int getWidth() {
		return this.width;

	}

	public void setHeight(int height) {
		this.height = height;

	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public int calculatearea() {
		return this.height * this.width;
	}
}
