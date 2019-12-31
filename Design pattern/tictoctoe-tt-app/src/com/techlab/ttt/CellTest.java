package com.techlab.ttt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CellTest {

	@Test
	public void testForAnEmptyCell() {
		Cell cell = new Cell();
		Mark expected = Mark.EMPTY;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCellState() throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.EMPTY);
		Mark expected = Mark.EMPTY;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCellState_XIsGiven_ResultShouldBEX() throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.X);
		Mark expected = Mark.X;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCellState_OIsGiven_ResultShouldBEO() throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.O);
		Mark expected = Mark.O;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

}