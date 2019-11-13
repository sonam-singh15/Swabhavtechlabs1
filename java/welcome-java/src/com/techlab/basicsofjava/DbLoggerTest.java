package com.techlab.basicsofjava;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class DbLoggerTest {

	public static void main(String[] args) {
		String f1 = args[0];
		String f2 = args[0];
		String f3 = args[0];

		try {
			FileInputStream fstream = new FileInputStream("C:\\Users\\Swabhav\\Desktop\\db_app.log");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			strLine = br.readLine();

			while ((strLine = br.readLine()) != null) {
				if (f1.equals("-e")) {
					if (strLine.contains("ERROR")) {
						System.out.println(strLine);
					}
				} else if (f2.equals("-i")) {
					if (strLine.contains("INFO")) {
						System.out.println(strLine);
					}
				} else if (f3.equals("-w"))
					if (strLine.contains("WARNING")) {
						System.out.println(strLine);
					}

			}

			fstream.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}

}
