package com.techalb.tictoctoe.test;

import com.techlab.tictoctoe.GameBoard;

public class TicTocToeTest {
	public static void main(String[] args) {

		GameBoard board = new GameBoard();
		// board.printBoard();

		board.makeMove('O', 0, 0);
		board.makeMove('X', 1, 1);
		board.printBoard();

	}
}
