package com.techlab.basicsofjava;

import java.util.Scanner;
import java.util.Random;

public class MenuDriven {
	
	public static Scanner sc = new Scanner(System.in);
	public static int randNo = 0, option = 0, nooftry = 0;
	

	public static void main(String args[]) {
		Random rand = new Random();
		randNo = rand.nextInt(10);
		display();
	}

	public static void display() {
		final int Start = 1, Stop = 2, Quit = 3;
		System.out.println("Menu:");
		System.out.println("1.Start");
		System.out.println("2.Stop");
		System.out.println("3.Quit");
		System.out.println("Enter any option from above");
		option = sc.nextInt();
		do {
			switch (option) {
			case Start:
				start();
				break;
			case Stop:
				stop();
				break;
			case Quit:
				System.out.println("Quitting the program");
				break;
			default:
				System.out.println("Plase enter valid option");
				break;
			}

		} while (option != 3);
	}

	public static void start() {
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

	public static void stop() {
		boolean win = false;
		while (win == false) {
			System.out.println("enter any no between 0 to 10 ");
			int Guess = sc.nextInt();
			System.out.print(Guess);
			nooftry++;
			if (Guess == randNo) {
				win = true;
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

}
