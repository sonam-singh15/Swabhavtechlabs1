package com.techlab.ttt;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Console implements ICellDecider {

	public int readInput(Board board) {
		try {
			System.out.println("Please Enter comma seperated id");
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] line = br.readLine().replace(" ", "").split(",");
			if (line.length < 2)
				return -1;
			int row = Integer.parseInt(line[0]);
			int column = Integer.parseInt(line[1]);
			return row * board.getSize() + column;
		} catch (IOException exception) {
			return -1;
		} catch (NumberFormatException exception) {
			System.out.println("I have no idea how to parse" + " what you just entered");
			return -1;
		}
	}

	@Override
	public int decideCell(Board board, Mark mark) {
		int input = -1;
		final int MAX_CELL_ID = board.getSize() * board.getSize();
		while (input == -1 || input >= MAX_CELL_ID)
			input = readInput(board);
		return input;
	}

}
