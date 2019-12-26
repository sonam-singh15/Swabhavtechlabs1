package com.techlab.ttt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoardTest {

	@Test
	public void testBoardConstructor_CallingConstructor_ShouldInitializeCellsArrayBy9Cell() {
		Board board = new Board();
		Cell[] cellArray = board.getCellsArray();
		int expected = 9;
		int actual = cellArray.length;
		System.out.println(actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testPutMarkOnCell_MarkingCell0ByX_OnCell0ResultShouldBeX() throws CellIsAlredyMarkedException {
		Board board = new Board();
		int cellNumber = 0;
		board.putMarkOnCell(Mark.X, cellNumber);
		Mark expectedMark = Mark.X;
		Mark actualMark = board.getMarkOnCell(cellNumber);
		System.out.println(actualMark);
		assertEquals(expectedMark, actualMark);
	}

	@Test
	public void testPutMarkOnCell_tryingToRemarkCell0_ResultShouldBeThrowException()
			throws CellIsAlredyMarkedException {
		Board board = new Board();
		board.putMarkOnCell(Mark.O, 0);
		board.putMarkOnCell(Mark.X, 0);
	}
}
