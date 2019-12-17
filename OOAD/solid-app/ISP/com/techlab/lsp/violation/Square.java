package com.techlab.lsp.violation;

public class Square extends Rectangle {

	public Square(int size) {
		super(size, size);
	}

	@Override
	public void setHeight(int size) {
		this.width = this.height = size;

	}

	@Override
	public void setWidth(int size) {
		this.width = this.height = size;

	}

	public int calculateArea() {
		return height * width;

	}

}
