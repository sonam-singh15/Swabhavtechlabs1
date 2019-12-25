package com.techlab.ttt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class GameTest {

	@Test
	public void testStartGame_StartingGame_CurrentPlayerShouldBePlayer1() {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		System.out.println(game.getMOVE_COUNTER());
		String expected = playerOne.getName();
		String actual = game.getCurrentPlayer().getName();
		System.out.println("Current player:-" + actual);
		assertEquals(expected, actual);
	}

	@Test
	public void testStartGame_MakingMove_CurrentPlayerShouldBePlayer2()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		game.play(0);
		//System.out.println(game.getMOVE_COUNTER());
		String expected = playerTwo.getName();
		String actual = game.getCurrentPlayer().getName();
		assertEquals(expected, actual);
	}

	@Test
	public void testStartGame_StepsGivenToWinPlayer1_ResultShouldBePlayer1IsWinner()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		Gamestatus expected = Gamestatus.WIN;
		Gamestatus status = game.play(0);
		status = game.play(4);
		status = game.play(1);
		status = game.play(3);
		status = game.play(2);
		Gamestatus actual = status;
		System.out.println("status :-" + actual);
		assertEquals(expected, actual);

	}

	@Test
	public void testStartGame_StepsGivenToWinPlayer2_ResultShouldBePlayer2IsWinner()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		Gamestatus expected = Gamestatus.WIN;
		Gamestatus status = game.play(0);
		status = game.play(3);
		status = game.play(6);
		status = game.play(4);
		status = game.play(2);
		status = game.play(5);
		Gamestatus actual = status;
		assertEquals(expected, actual);

	}
}
