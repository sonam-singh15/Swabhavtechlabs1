package com.techlab.basicsofjava;

import java.io.FileWriter;
import java.io.IOException;

public class WritingIntoFile {
	public static void main(String[] args) throws IOException {

		String str = "Welcome to Swabhav techlabs , " + "I am developer Sonam Singh";
		FileWriter fw = null;

		try {
			fw = new FileWriter("C:\\Users\\Swabhav\\Desktop\\sample (2).txt");
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (int i = 0; i < str.length(); i++)
			fw.write(str.charAt(i));

		System.out.println("Writing successful");

		fw.close();

	}

}
