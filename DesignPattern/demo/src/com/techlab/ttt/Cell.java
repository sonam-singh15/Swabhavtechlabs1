package com.techlab.ttt;

public class Cell {

	private Mark mark;

	public Cell() {
		this.mark = Mark.EMPTY;
	}

	public Mark getMark() {
		return this.mark;
	}

	public void setMark(Mark mark) throws NonEmptyCell {
		if (this.mark != Mark.EMPTY)
			throw new NonEmptyCell();
		this.mark = mark;

	}

	public boolean isEmpty() {
		return this.mark == Mark.EMPTY;

	}
}
