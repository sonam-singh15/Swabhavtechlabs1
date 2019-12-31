package com.techlab.ttt.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.techlab.ttt.Board;
import com.techlab.ttt.CellIsAlredyMarkedException;
import com.techlab.ttt.Game;
import com.techlab.ttt.Mark;
import com.techlab.ttt.Player;
import com.techlab.ttt.Result;
import com.techlab.ttt.ResultAnalyzer;

public class GameConsole {

	public static void main(String[] args) {

		ArrayList<Player> players = new ArrayList<Player>();

		Scanner sc = new Scanner(System.in);
		System.out.println("welcome to tic toc game of 3*3");
		int size = 3;
		Board board1 = new Board(size);

		System.out.println("Enter the name of the first player: ");
		String name1 = sc.next();
		Player player1 = new Player(name1, Mark.X);

		System.out.println("Enter the name of the second player: ");
		String name2 = sc.next();
		Player player2 = new Player(name2, Mark.O);

		players.add(player1);
		players.add(player2);

		ResultAnalyzer resultAn = new ResultAnalyzer(board1);
		Game game = new Game(players, board1, resultAn);
		displayBoard(board1);
		System.out.println(name1 + " to play(pick the position to enter mark: ");

		for (int i = 0; i < size * size; i++) {
			int index = sc.nextInt();

			try {
				game.play(index);
				System.out.println(game.nextPlayer() + " to play: ");
			} catch (CellIsAlredyMarkedException e) {
				game.setCurrentPlayer();
				System.out.println(e.getMessage());
				System.out.println("Try again with different cell");

			}

			Result result = resultAn.giveResult(board1, game.getCurrentPlayer().getMark(), index);
			displayBoard(board1);
			if (result == Result.WIN) {
				System.out.println(
						"Congratulations, " + game.getCurrentPlayer().getName() + " won. \nThe Game" + " has ended.");
				break;
			} else if (result == Result.DRAW) {
				System.out.println("It's a draw.");
				break;
			}
		}
	}

	public static void displayBoard(Board b) {
		int size = (int) Math.sqrt(b.getCellList().size());
		int index = 0;
		for (int i = 0; i < size; i++) {
			System.out.println();
			for (int j = 0; j < size; j++) {
				if (b.getCellList().get(index).getMark() == Mark.EMPTY) {
					System.out.print(" EMPTY ");
					index++;
					continue;
				} else if (b.getCellList().get(index).getMark() == Mark.X) {
					System.out.print(" X ");
					index++;
					continue;
				} else {
					System.out.print(" O ");
					index++;
				}
			}
		}
		System.out.println();
	}

}