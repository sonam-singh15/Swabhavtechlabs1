package com.techlab.basicsofjava;

import java.io.*;

public class ReadingFromFile {
	public static void main(String[] args) throws IOException {

		try {
			FileInputStream fstream = new FileInputStream("C:\\\\Users\\\\Swabhav\\\\Desktop\\\\db_app.log");
			BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
			String strLine;
			strLine = br.readLine();

			 while ((strLine = br.readLine()) != null)   {
				if (strLine.contentEquals("ERROR"))
				{
					System.out.println(strLine);
			}
			}
			fstream.close();
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}
	}
}
