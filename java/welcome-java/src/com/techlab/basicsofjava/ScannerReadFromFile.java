package com.techlab.basicsofjava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ScannerReadFromFile {
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("C:\\Users\\Swabhav\\Desktop\\sample.csv");
		Scanner scan = null;

		try {
			scan = new Scanner(fr);

			while (scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] lineArray = line.split(",");
				for (String s : lineArray) {
					System.out.println(s);
				}

			}
		} finally {
			scan.close();
		}
	}
}
