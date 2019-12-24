package com.techlab.ttt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CellTest1 {

	@Test
	void testCheckForEmptyCell() {
		Cell cell = new Cell();

		Mark actual = cell.getMark();

		Mark expected = Mark.EMPTY;

		assertEquals(expected, actual);
	}

	@Test
	void testCheckForChangeInMark() throws NonEmptyCell {
		Cell cell = new Cell();
		Assertions.assertTrue(cell.isEmpty());

		cell.setMark(Mark.CIRCLE);
		Assertions.assertFalse(cell.isEmpty());
	}

	@Test
	void testCheckForRepeatedMark() throws NonEmptyCell {
		Cell cell = new Cell();
		cell.setMark(Mark.CIRCLE);

		Assertions.assertThrows(NonEmptyCell.class, () -> {
			cell.setMark(Mark.CIRCLE);
		});
	}

}
