package com.techlab.ttt;

public class Cell {
	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Cell(Mark mark) {
		this.mark = mark;
	}

	public void setMark(Mark mark) {
		if (this.mark == Mark.EMPTY) {
			this.mark = mark;
		} else {
			throw new RuntimeException("Cell is already marked");
		}
	}

	public Mark getMark() {
		return mark;
	}

}
