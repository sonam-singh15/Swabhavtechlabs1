package com.techlab.ttt.test;

import java.util.Scanner;

import com.techlab.ttt.Board;
import com.techlab.ttt.CellIndexOutOfBound;
import com.techlab.ttt.CellIsAlredyMarkedException;
import com.techlab.ttt.Game;
import com.techlab.ttt.Gamestatus;
import com.techlab.ttt.Mark;
import com.techlab.ttt.Player;

public class ConsoleTest {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player player1 = new Player("sonam", Mark.O);
		Player player2 = new Player("anajli", Mark.X);

		Game game = new Game(player1, player2);
		Scanner sc = new Scanner(System.in);
		Board board = new Board();

		displayBoard(board);
		System.out.println(" ");

		System.out.println("Its sonam's turn to play ..pleease mark o");
		int cellnumber1 = sc.nextInt();
		game.makeMove(player1, cellnumber1);
		game.displayBoard();

		System.out.println("Its anjali's turn to play ..pleease mark x");
		int cellnumber2 = sc.nextInt();
		game.makeMove(player2, cellnumber2);
		game.displayBoard();
		System.out.println(" ");

		System.out.println("Its sonam's turn to play ..pleease mark o");
		int cellnumber3 = sc.nextInt();
		game.makeMove(player1, cellnumber3);
		game.displayBoard();

		System.out.println("Its anjali's turn to play ..pleease mark x");
		int cellnumber4 = sc.nextInt();
		game.makeMove(player2, cellnumber4);
		game.displayBoard();
		System.out.println(" ");

		System.out.println("Its sonam's turn to play ..pleease mark o");
		int cellnumber5 = sc.nextInt();
		game.makeMove(player1, cellnumber5);
		game.displayBoard();

		System.out.println("Its anjali's turn to play ..pleease mark x");
		int cellnumber6 = sc.nextInt();
		game.makeMove(player2, cellnumber6);
		game.displayBoard();
		System.out.println(" ");

		System.out.println("Its sonam's turn to play ..pleease mark o");
		int cellnumber7 = sc.nextInt();
		game.makeMove(player2, cellnumber7);
		game.displayBoard();
		System.out.println(" ");

		System.out.println("Its anjali's turn to play ..pleease mark x");
		int cellnumber8 = sc.nextInt();
		game.makeMove(player2, cellnumber8);
		game.displayBoard();
		System.out.println(" ");

		Gamestatus status = game.play();
		String player = game.getCurrentPlayer().getName();
		Mark mark = game.getCurrentPlayer().getMark();
		System.out.println("Game is:" + status + " By " + player + " with mark " + mark);

	}

	public static void displayBoard(Board board) {
		for (int index = 0; index < board.getBoardSize(); index++) {
			System.out.println(board.getMarkOnCell(index++) + "\t" + board.getMarkOnCell(index++) + "\t"
					+ board.getMarkOnCell(index));
		}
	}

}
