package com.techlab.ttt;

public class GameController {
	private Game game;
	private int boardSize;
	private String header;

	public GameController() {
		this(3);
	}

	public GameController(int boardSize) {
		this.boardSize = boardSize;
		this.setUpGame(this.boardSize);
	}

	private void setUpGame(int boardSize) {
		Board board = new Board(boardSize);
		ResultAnalyzer rAnalyzer = new ResultAnalyzer(board);
		this.game = new Game(board, rAnalyzer, UserFactory.getUsers(2));
		setBoardHeader();
	}

	private void setBoardHeader() {
		StringBuilder builder = new StringBuilder("   ");
		for (int i = 0; i < this.boardSize; i++)
			builder.append(Integer.toString(i) + " ");
		this.header = builder.toString();
	}

	public void playGame() {
		Result res = Result.INPROGRESS;
		while (Result.INPROGRESS == res) {
			printGameBoard();
			printCurrentUser();
			int cellId = game.getCurrentUser().decideCell(game.getBoard());
			if (res == Result.INVALID) {
				System.err.println("Cell is already marked");
			}
		}
		printGameBoard();
		endGame(res);
	}

	private void endGame(Result res) {
		switch (res) {
		case WIN:
			System.out.printf("%s won\n", game.getCurrentUser().getName());
			break;

		case DRAW:
			System.out.println("Game was draw");
			break;

		default:
			System.err.printf("How the hell did this happened: %s\n", res);
			break;
		}
	}

	private void printCurrentUser() {
		System.out.printf("%s's turn [%s]\n", game.getCurrentUser().getName(), game.getCurrentUser().getMark());
	}

	private void printGameBoard() {
		final char[] marks = { ' ', 'X', 'O' };
		Cell[] cells = game.getBoard().getGrid();
		System.out.println(this.header);
		for (int i = 0; i < this.boardSize; i++) {
			int row = i * this.boardSize;
			System.out.print(i + " |");
			for (int j = 0; j < this.boardSize; j++) {
				int index = cells[row + j].getMark().ordinal();
				System.out.print(marks[index] + "|");
			}
			System.out.println();
		}
	}
}