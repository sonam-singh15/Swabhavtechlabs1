package com.techlab.ttt.test;

import java.util.Scanner;

import com.techlab.ttt.Board;
import com.techlab.ttt.CellIndexOutOfBound;
import com.techlab.ttt.CellIsAlredyMarkedException;
import com.techlab.ttt.Game;
import com.techlab.ttt.Gamestatus;
import com.techlab.ttt.Mark;
import com.techlab.ttt.Player;
import com.techlab.ttt.ResultAnalyzer;

public class ConsoleTest4 {
	public static void main(String args[]) throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player player2 = new Player("sonam", Mark.O);
		Player player1 = new Player("anajli", Mark.X);

		Game game = new Game(player1, player2);
		Scanner sc = new Scanner(System.in);

		game.displayBoard();
		System.out.println(" ");

		Gamestatus res = Gamestatus.INPROGRESS;

		while (res == Gamestatus.INPROGRESS) {
			Player player = game.getCurrentPlayer();
			System.out.println("Player's Turn :-" + player.getName());
			System.out.println("Please enter cell number to mark :-");
			int cellnumber = sc.nextInt();
			try {
				game.makeMove(player, cellnumber);
			} catch (CellIsAlredyMarkedException e) {
				System.out.println("message" + e.getMessage());

			}
			game.displayBoard();
			break;

		}
		Gamestatus finalstatus = game.play();
		String player = game.getCurrentPlayer().getName();
		Mark mark = game.getCurrentPlayer().getMark();
		System.out.println("Game is:" + finalstatus + " By " + player + " with mark " + mark);

	}

	public static void displayBoard(Board board) {
		for (int index = 0; index < board.getBoardSize(); index++) {
			System.out.println(board.getMarkOnCell(index++) + "\t" + board.getMarkOnCell(index++) + "\t"
					+ board.getMarkOnCell(index));
		}
	}

}
