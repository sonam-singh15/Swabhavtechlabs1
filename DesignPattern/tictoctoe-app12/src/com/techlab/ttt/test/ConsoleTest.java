package com.techlab.ttt.test;

import com.techlab.ttt.CellIndexOutOfBound;
import com.techlab.ttt.CellIsAlredyMarkedException;
import com.techlab.ttt.Game;
import com.techlab.ttt.Gamestatus;
import com.techlab.ttt.Mark;
import com.techlab.ttt.Player;

public class ConsoleTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player player1 = new Player("anjali", Mark.O);
		Player player2 = new Player("sonam", Mark.X);

		Game game = new Game(player1, player2);

		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 4);
		game.makeMove(player2, 1);
		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 3);
		game.makeMove(player2, 2);
		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 7);
		game.makeMove(player2, 5);
		game.displayBoard();
		System.out.println(" ");

		game.makeMove(player1, 6);
		game.makeMove(player2, 8);
		game.displayBoard();

		Gamestatus status = game.play(0);
		String player = game.getCurrentPlayer().getName();
		System.out.println("Game is:" + status + " By " + player);

	}
}
