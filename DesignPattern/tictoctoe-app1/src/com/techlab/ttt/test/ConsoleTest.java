package com.techlab.ttt.test;

import java.util.Scanner;

import com.techlab.tictoctoe.CellIndexOutOfBound;
import com.techlab.tictoctoe.CellIsAlredyMarkedException;
import com.techlab.tictoctoe.Game;
import com.techlab.tictoctoe.GameStatus;
import com.techlab.tictoctoe.Mark;
import com.techlab.tictoctoe.Player;

public class ConsoleTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player player1 = new Player("sonam", Mark.X);
		Player player2 = new Player("anjali", Mark.O);
		Game game = new Game(player1, player2);

		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to 2 Player Tic Tac Toe.");
		System.out.println("--------------------------------");
		game.displayBoard();

		System.out.println("O's will play first. Enter a slot number to place O in:");
		int cellnumber1 = sc.nextInt();

		game.makeMove(player1, cellnumber1);
		game.displayBoard();

		System.out.println("X's will play second. Enter a slot number to place X in:");
		int cellnumber2 = sc.nextInt();
		game.makeMove(player2, cellnumber2);
		game.displayBoard();
		System.out.println(" ");

		System.out.println("O's will play first. Enter a slot number to place O in:");
		int cellnumber3 = sc.nextInt();

		game.makeMove(player1, cellnumber3);
		game.displayBoard();

		System.out.println("X's will play second. Enter a slot number to place X in:");
		int cellnumber4 = sc.nextInt();
		game.makeMove(player2, cellnumber4);
		game.displayBoard();

		System.out.println(" ");

		System.out.println("O's will play first. Enter a slot number to place O in:");
		int cellnumber5 = sc.nextInt();

		game.makeMove(player1, cellnumber5);
		game.displayBoard();

		System.out.println("X's will play second. Enter a slot number to place X in:");
		int cellnumber6 = sc.nextInt();
		game.makeMove(player2, cellnumber6);
		game.displayBoard();

		GameStatus status = game.play(0);
		String player = game.getCurrentPlayer().getName();
		System.out.println("Game is :" + status + " By " + player);

	}
}