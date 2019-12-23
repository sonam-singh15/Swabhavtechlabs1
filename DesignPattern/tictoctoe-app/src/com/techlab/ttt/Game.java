package com.techlab.ttt;

public class Game {
	private Board board;
	private ResultAnalyzer resultAnalyzer;

	private User[] users;
	private int turn;

	public Game(Board board, ResultAnalyzer resultAnalyzer, User[] users) {
		this.board = board;
		this.resultAnalyzer = resultAnalyzer;
		this.users = users;
		this.turn = 0;
	}

	public Result play(int cellId) {
		try {
			board.markCell(cellId, users[turn].getMark());
			changeTurn();
		} catch (NonEmptyCell e) {
			return Result.INPROGRESS;
		}
		return resultAnalyzer.checkBoard(users[turn].getMark(), cellId);
	}

	public void changeTurn() {
		this.turn = (this.turn + 1) % this.users.length;
	}

	public User getCurrentUser() {
		return this.users[this.turn];
	}

	public Board getBoard() {
		return this.board;
	}
}
