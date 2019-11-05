package com.techlab.basicsofjava;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadingFromFile {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("C:\\Users\\Swabhav\\Desktop\\sample.csv");
		int i;
		System.out.println("Read Data Line by Line With Header \n");
		System.out.println("_______________________________________________");

		while ((i = fr.read()) != -1)
			System.out.print((char) i);

	}
}
