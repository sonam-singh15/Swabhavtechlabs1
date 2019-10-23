package com.techlab.basicsofjava;

public class CodeMagnet1 {
	public static void main(String[] args) {
		int x = 3;
		while (x > 0) {
			if (x > 2) {
				System.out.println("a");
			}

			System.out.println("-");
			x = x - 1;
			if (x == 2)
				System.out.println("b\n c");
			
			if (x == 1) {
				System.out.println("d");
				x = x - 1;
			}
		}
	}
}
