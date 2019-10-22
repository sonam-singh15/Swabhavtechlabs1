package com.techlab.basicsofjava;
import java.util.Scanner;
import java.util.Random;

public class MenuDriven {
	public static void main(String args[]) {
		Random rand = new Random();
		int randNo = 0, option = 0, nooftry = 0;
		randNo = rand.nextInt(10);
		
		display();
		
	}
	public static void start(int randNo, int nooftry) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any no between 0 to 10 ");
		int Guess = sc.nextInt();
		System.out.print(Guess);
		nooftry++;
		if (Guess == randNo) {
			System.out.println("guess right in no of try:" + nooftry);
		} else if (Guess < randNo) {
			System.out.println("your guess is too low");
		} else if (Guess > randNo) {
			System.out.println("your guess is too high");
		}
	}

	public static void stop(int randNo,int nooftry) {
		Scanner sc = new Scanner(System.in);
		boolean win = false;
		while (win == false) {
			System.out.println("enter any no between 0 to 10 ");
			int Guess = sc.nextInt();
			System.out.print(Guess);
			nooftry++;
			if (Guess == randNo) {
				win = true;
				// System.out.println("guess right in no of try:" + nooftry);
			} else if (Guess < randNo) {
				System.out.println("your guess is too low");
			} else if (Guess > randNo) {
				System.out.println("your guess is too high");
			}

		}
		System.out.println("You win");
		System.out.println("Your no was:" + randNo);
		System.out.println("It took the no of try as :" + nooftry);

	}
	public static void display()
	{
		int randNo = 0, option = 0, nooftry = 0;
		final int start = 1, stop = 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Menu:");
		System.out.println("1.Display");
		System.out.println("2.Start");
		System.out.println("3.stop");
		System.out.println("Enter any option from above");
		option = sc.nextInt();
		do {
			switch (option) {
			case start:
				start(randNo,nooftry);
				break;
			case stop:
				stop(randNo,nooftry);
				break;
			default:
				System.out.println("Plase enter valid option");
				break;
			}

		} while (option != 3);
	}

}



