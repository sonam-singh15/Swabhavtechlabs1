package com.techlab.ttt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class BoardTest {

	@Test
	public void testBoardConstructor_ShouldInitializeCellsArrayBy9Cell() {
		Board board = new Board();
		Cell[] cellArray = board.getCellsArray();
		int expected = 9;
		int actual = cellArray.length;
		assertEquals(expected, actual);
	}

	@Test
	public void testPutMarkOnCell_MarkingCell0ByX_OnCell0ResultShouldBeX() throws CellIsAlredyMarkedException {
		Board board = new Board();
		int cellNumber = 0;
		board.putMarkOnCell(Mark.X, cellNumber);
		Mark expectedMark = Mark.X;
		Mark actualMark = board.getMarkOnCell(cellNumber);
		assertEquals(expectedMark, actualMark);
	}

	@Test
	public void testPutMarkOnCell_tryingToRemarkCell0_ResultShouldBeThrowException()
			throws CellIsAlredyMarkedException {
		Board board = new Board();
		board.putMarkOnCell(Mark.O, 0);
		board.putMarkOnCell(Mark.X, 0);
	}

	@Test
	public void testGameConstructor_RunningConstructor_BoardShouldBeInitializedWithEmptyCell() {
		Board board = new Board();
		Mark expected = Mark.EMPTY;
		for (int index = 0; index < board.getBoardSize(); index++) {
			Mark actual = board.getMarkOnCell(index);
			System.out.println("board:-" + actual);
			assertEquals(expected, actual);
		}
	}

}
