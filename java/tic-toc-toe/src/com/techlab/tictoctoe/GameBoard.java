package com.techlab.tictoctoe;

import java.util.Arrays;

public class GameBoard {
	private char[][] board;

	public GameBoard() {
		board = new char[3][3];

	}

	public void initializeBoard() {

		for (int row = 0; row < board.length; row++)
			Arrays.fill(board[row], ' ');

	}

	public void printBoard() {

		System.out.println("-------------");

		for (int row = 0; row < board.length; row++) {
			for (int col = 0; col < board[0].length; col++) {
				System.out.print(board[row][col] + " | ");
				if (col == 0 || col == 1)
					System.out.println("|");
			}
			System.out.println();
			System.out.println("-------------");
		}

	}

	public boolean makeMove(char player, int row, int col) {
		if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {
			if (board[row][col] != ' ')
				return false;
			else {
				board[row][col] = player;
				return true;
			}
		}
		return false;

	}

}
