package com.techlab.ttt.test;

import com.techlab.ttt.CellIndexOutOfBound;
import com.techlab.ttt.CellIsAlredyMarkedException;
import com.techlab.ttt.Game;
import com.techlab.ttt.GameStatus;
import com.techlab.ttt.Mark;
import com.techlab.ttt.Player;

public class ConsoleTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player player1 = new Player("sonam", Mark.O);
		Player player2 = new Player("anjali", Mark.X);
		Game game = new Game(player1, player2);

		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 2);
		game.makeMove(player2, 1);

		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 5);
		game.makeMove(player2, 7);

		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 6);
		game.makeMove(player2, 4);
		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 3);
		game.makeMove(player2, 8);

		game.displayBoard();
		System.out.println(" ");

		GameStatus status = game.play(0);
		String player = game.getCurrentPlayer().getName();
		System.out.println("Game is :" + status + " By " + player);

	}
}