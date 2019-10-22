package com.techlab.basicsofjava;
import java.util.Scanner;
import java.util.Random;

public class GuessNoRandomly {
	public static void main(String args[]) {
		Random rand=new Random();
		int randNo=0,option=0,nooftry = 0;
		randNo=rand.nextInt(10);
		Scanner sc = new Scanner(System.in);
		boolean win = false;
		while (win == false) {
			System.out.println("enter any no between 1 to 10 ");
			int Guess = sc.nextInt();
			System.out.print(Guess);
			nooftry++;
			if (Guess ==randNo)
			{
				win = true;
			} else if (Guess < randNo) {
				System.out.println("your guess is too low");
			} else if (Guess > randNo) {
				System.out.println("your guess is too high");
			}

		}
		System.out.println("You win");
		System.out.println("Your no was:" + randNo);
		System.out.println("It took :" + nooftry);

	}
}

