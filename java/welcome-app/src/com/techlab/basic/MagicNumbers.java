package com.techlab.basic;

import java.util.Scanner;

public class MagicNumbers {
	public static void main() {
		System.out.println("Enter any number : ");
		Scanner scan = new Scanner(System.in);
		int inputNumber = scan.nextInt();
		if (inputNumber % 9 == 1)
			System.out.println(inputNumber + " is a Magic Number");
		else
			System.out.println(inputNumber + " is NOT a Magic Number");
	}

}
