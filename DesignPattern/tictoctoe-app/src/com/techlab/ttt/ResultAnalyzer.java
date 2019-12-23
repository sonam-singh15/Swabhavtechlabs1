package com.techlab.ttt;

public class ResultAnalyzer {

	private Board board;

	public ResultAnalyzer(Board board) {
		this.board = board;
	}

	public Result checkBoard(Mark type, int cellId) {
		if (checkRows(type, cellId))
			return Result.WIN;
		if (checkColumns(type, cellId))
			return Result.WIN;
		if (checkDiagonal(type, cellId))
			return Result.WIN;
		if (checkReverseDiagonal(type, cellId))
			return Result.WIN;
		if (isBoardFilled())
			return Result.DRAW;
		return Result.INPROGRESS;
	}

	private boolean checkRows(Mark mark, int cellId) {
		if (mark == Mark.EMPTY)
			return false;
		int size = board.getSize();
		Cell[] cells = board.getGrid();
		int offset = (cellId / size) * size;
		for (int i = offset; i < offset + size; i++)
			if (cells[i].getMark() != mark)
				return false;
		return true;
	}

	private boolean checkColumns(Mark mark, int cellId) {
		if (mark == Mark.EMPTY)
			return false;
		int size = board.getSize();
		Cell[] cells = board.getGrid();
		int offset = (cellId % size);
		for (int i = 0; i < size; i++)
			if (cells[(i * size) + offset].getMark() != mark)
				return false;
		return true;
	}

	private boolean checkDiagonal(Mark mark, int cellId) {
		if (mark == Mark.EMPTY)
			return false;
		int size = board.getSize();
		if (cellId / size != cellId % size)
			return false;
		Cell[] cells = board.getGrid();
		for (int i = 0; i < size; i++)
			if (cells[i * size + i].getMark() != mark)
				return false;
		return true;
	}

	private boolean checkReverseDiagonal(Mark mark, int cellId) {
		if (mark == Mark.EMPTY)
			return false;
		int size = board.getSize();
		int row = cellId / size;
		int column = cellId % size;
		if (row != (size - 1 - column))
			return false;
		Cell[] cells = board.getGrid();
		for (int i = 0; i < size; i++) {
			int index = (i * size) + (size - 1 - i);
			if (cells[index].getMark() != mark)
				return false;
		}
		return true;
	}

	private boolean isBoardFilled() {
		Cell[] cells = board.getGrid();
		for (int i = 0; i < cells.length; i++)
			if (cells[i].isEmpty())
				return false;
		return true;
	}
}
