
package com.techlab.basicsofjava;

import java.util.Scanner;

public class ScannerExample {
	public static void main(String args[]) {
		int nooftry = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any random no ");
		int noToGuess = sc.nextInt();
		System.out.print(noToGuess);
		boolean win = false;
		while (win == false) {
			System.out.println("enter any no between 1 to 100 ");
			int Guess = sc.nextInt();
			System.out.print(Guess);
			nooftry++;
			if (Guess == noToGuess) {
				win = true;
				//System.out.println("Your guess is right in given no of try:" + nooftry);
			} else if (Guess < noToGuess) {
				System.out.println("your guess is too low");
			} else if (Guess > noToGuess) {
				System.out.println("your guess is too high");
			}

		}
		System.out.println("You win");
		System.out.println("Your no was:" + noToGuess);
		System.out.println("It took :" + nooftry);

	}
}
