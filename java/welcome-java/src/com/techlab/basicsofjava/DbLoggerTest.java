package com.techlab.basicsofjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DbLoggerTest {

	public static void main(String[] args) {
		boolean flag = false;
		for (String arg : args) {
			System.out.println(arg);
		}
		try {
			FileInputStream fstream = new FileInputStream("C:\\\\Users\\\\Swabhav\\\\Desktop\\\\db_app.log");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			strLine = br.readLine();

			while ((strLine = br.readLine()) != null) {
				if (args.equals("-e")) {
					if (strLine.contains("ERROR")) {
						System.out.println(strLine);
					}
				} else if (strLine.contains("INFO")) {
					System.out.println(strLine);
				}

			}

			fstream.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
