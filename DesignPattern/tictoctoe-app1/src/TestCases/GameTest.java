package TestCases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.techlab.tictoctoe.Board;
import com.techlab.tictoctoe.CellIndexOutOfBound;
import com.techlab.tictoctoe.CellIsAlredyMarkedException;
import com.techlab.tictoctoe.Game;
import com.techlab.tictoctoe.GameStatus;
import com.techlab.tictoctoe.Mark;
import com.techlab.tictoctoe.Player;

public class GameTest {

	@Test
	public void testGameConstructor_RunningConstructor_BoardShouldBeInitializedWithEmptyCell() {

		Board board = new Board();
		Mark expected = Mark.EMPTY;
		for (int index = 0; index < board.getBoardSize(); index++) {
			Mark actual = board.getMarkOnCell(index);
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testStartGame_StartingGame_CurrentPlayerShouldBePlayer1() {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anajli", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		System.out.println(game.getMOVE_COUNTER());
		String expected = playerOne.getName();
		String actual = game.getCurrentPlayer().getName();
		assertEquals(expected, actual);
	}

	@Test
	public void testStartGame_MakingMove_CurrentPlayerShouldBePlayer2()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anajali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		game.play(0);
		System.out.println(game.getMOVE_COUNTER());
		String expected = playerTwo.getName();
		String actual = game.getCurrentPlayer().getName();
		assertEquals(expected, actual);
	}

	@Test
	public void testStartGame_StepsGivenToWinPlayer1_ResultShouldBePlayer1IsWinner()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("anjali", Mark.O);
		Player playerTwo = new Player("sonam", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		GameStatus expected = GameStatus.WIN;
		GameStatus status = game.play(0);
		status = game.play(4);
		status = game.play(1);
		status = game.play(3);
		status = game.play(2);
		GameStatus actual = status;
		assertEquals(expected, actual);

	}

	@Test
	public void testStartGame_StepsGivenToWinPlayer2_ResultShouldBePlayer2IsWinner()
			throws CellIsAlredyMarkedException, CellIndexOutOfBound {
		Player playerOne = new Player("sonam", Mark.O);
		Player playerTwo = new Player("anjali", Mark.X);
		Game game = new Game(playerOne, playerTwo);
		GameStatus expected = GameStatus.WIN;
		GameStatus status = game.play(0);
		status = game.play(3);
		status = game.play(6);
		status = game.play(4);
		status = game.play(2);
		status = game.play(5);
		GameStatus actual = status;
		assertEquals(expected, actual);

	}
}