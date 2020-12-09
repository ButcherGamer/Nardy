package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**

 * Text Based version of backgammon
 */

public class Game {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int userInput;

	private Dice dice;
	private Board board;
	private boolean movesLeft;
	private boolean isWhite;

	public Game() {
		dice = new Dice();
		board = new Board();
	}



	// TODO remove text based interface

	/** 
	 * CLI representaion
	 * @version 1.0
	 */
	private void draw() {
		System.out.println();
		for (int i = 13; i < 25; i++) {
			if (board.getAmountArray()[i] != 0) {
				System.out.print("| " + board.getAmountArray()[i] + " "
						+ board.getColorArray()[i] + " | ");
			} else {
				System.out.print("|         | ");
			}
		}
		if ((board.getAmountArray()[25] != 0)) {
			System.out.print("| " + board.getAmountArray()[25] + " BB | ");
		} else {
			System.out.print("|         | ");
		}
		System.out.println();
		System.out
				.println("-----------------------------------------------------------");
		for (int i = 12; i > 0; i--) {
			if (board.getAmountArray()[i] != 0) {
				System.out.print("| " + board.getAmountArray()[i] + " "
						+ board.getColorArray()[i] + " | ");
			} else {
				System.out.print("|         | ");
			}
		}
		if ((board.getAmountArray()[0] != 0)) {
			System.out.print("| " + board.getAmountArray()[0] + " WB | ");
		} else {
			System.out.print("|         | ");
		}
		System.out.println();

	}

	private void changePlayer() {
		if (isWhite) {
			isWhite = false;
		} else {
			isWhite = true;
		}
	}
}