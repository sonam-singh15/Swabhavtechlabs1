package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.techlab.tictoctoe.Cell;
import com.techlab.tictoctoe.CellIsAlredyMarkedException;
import com.techlab.tictoctoe.Mark;

public class CellTest {

	@Test
	public void testCellConstructor_ShouldCreateAnEmptyCell() {
		Cell cell = new Cell();
		Mark expected = Mark.EMPTY;
		Mark actual = cell.getCellState();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetCellState_EmptyIsGiven_ResultShouldBeEmpty() throws CellIsAlredyMarkedException {
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

	@Test
	public void testSetCellState_TryToMarkCellAgainByX_ShouldReturnCellNotEmptyException()
			throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.O);
		cell.setCellState(Mark.X);
	}

	@Test
	public void testSetCellState_TryToMarkCellAgainByO_ShouldReturnCellNotEmptyException()
			throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.X);
		cell.setCellState(Mark.O);
	}

	public void testSetCellState_TryToSetMarkedCellToEmpty_ShouldReturnCellNotEmptyException()
			throws CellIsAlredyMarkedException {
		Cell cell = new Cell();
		cell.setCellState(Mark.X);
		cell.setCellState(Mark.EMPTY);
	}

}
