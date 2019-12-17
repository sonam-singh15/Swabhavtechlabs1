package com.techlab.lsp.solution;

public class Square implements Polygon {
	private int side;

	public Square(int side) {
		this.side = side;
	}

	public int getSide() {
		return this.side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int calculatearea() {
		return this.side * this.side;
	}

}
