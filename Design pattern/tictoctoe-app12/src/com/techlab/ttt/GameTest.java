package com.techlab.ttt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameTest {

	@Test
	public void testStartGame_StartingGame_CurrentPlayerShouldBePlayer2() {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		System.out.println(game.getMOVE_COUNTER());
		String expected = playerTwo.getName();
		String actual = game.getCurrentPlayer().getName();
		System.out.println("Actual Current player:-" + actual);
		System.out.println("Expected Current player:-" + expected);
		assertEquals(expected, actual);
	}

	@Test
	public void testStartGame_MakingMove_CurrentPlayerShouldBePlayer1()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		game.play();
		String expected = playerOne.getName();
		String actual = game.getCurrentPlayer().getName();
		System.out.println("Actual Current player:-" + actual);
		System.out.println("Expected Current player:-" + expected);
		assertEquals(expected, actual);
	}

	@Test
	public void testStartGame_StepsGivenToWinPlayer1_ResultShouldBePlayer1IsWinner()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		Gamestatus expected = Gamestatus.WIN;
		game.makeMove(playerOne, 0);
		game.makeMove(playerTwo, 2);
		game.makeMove(playerOne, 4);
		game.makeMove(playerTwo, 1);
		game.makeMove(playerOne, 8);
		game.makeMove(playerTwo, 5);

		Gamestatus status = game.play();
		Gamestatus actual = status;
		// System.out.println("status :-" + actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testStartGame_StepsGivenToWinPlayer2_ResultShouldBePlayer2IsWinner()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		Gamestatus expected = Gamestatus.WIN;
		game.makeMove(playerOne, 1);
		game.makeMove(playerTwo, 0);
		game.makeMove(playerOne, 6);
		game.makeMove(playerTwo, 4);
		game.makeMove(playerOne, 5);
		game.makeMove(playerTwo, 8);

		Gamestatus status = game.play();
		Gamestatus actual = status;
		assertEquals(expected, actual);

	}
}
