package com.techlab.ttt;

public class User {
	private Mark mark;
	private String name;
	private ICellDecider cellLogic;

	public User(String name, Mark mark, ICellDecider cellLogic) {
		this.name = name;
		this.setCellLogic(cellLogic);
		this.setMark(mark);
	}

	public String getName() {
		return this.name;
	}

	public void setCellLogic(ICellDecider cellLogic) {
		this.cellLogic = cellLogic;
	}

	private void setMark(Mark mark) {
		if (mark == Mark.EMPTY)
			throw new RuntimeException("Can't set mark to empty");
		this.mark = mark;
	}

	public Mark getMark() {
		return this.mark;
	}

	public int decideCell(Board board) {
		return this.cellLogic.decideCell(board, this.mark);
	}
}
