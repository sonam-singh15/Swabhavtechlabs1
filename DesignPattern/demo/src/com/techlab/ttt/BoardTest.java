package com.techlab.ttt;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BoardTest {

	private final int size = 3;

	@Test
	public void testSize() {
		Board b = new Board(size);
		Assertions.assertTrue(size == b.getSize());
	}

	@Test
	public void checkForValidMark() throws NonEmptyCell {
		Board b = new Board(3);
		Cell[] c = b.getGrid();

		b.markCell(0, Mark.CIRCLE);

		Assertions.assertFalse(c[0].isEmpty());

		b.markCell(1, Mark.CROSS);
		Assertions.assertFalse(c[1].isEmpty());

		Assertions.assertThrows(NonEmptyCell.class, () -> {
			b.markCell(1, Mark.CIRCLE);
		});
	}

	public void checkIfBoardIsEmpty() {

		Board b = new Board(size);
		int actual = b.getSize();

		int expected = 0;

		assertEquals(expected, actual);
	}
}