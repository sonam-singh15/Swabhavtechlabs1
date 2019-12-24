package com.techlab.ttt;

public class Board {
	private Cell[] grid;
	private int size;

	public Board(int size) {
		this.size = size;
	}

	private void generateGrid(int size) {
		this.grid = new Cell[size * size];
		for (int i = 0; i < grid.length; i++)
			grid[i] = new Cell();
	}

	public int getSize() {
		return this.size;
	}

	public Cell[] getGrid() {
		return this.grid;
	}

	public void markCell(int cellId, Mark type) throws NonEmptyCell {
		grid[cellId].setMark(type);
	}
}
