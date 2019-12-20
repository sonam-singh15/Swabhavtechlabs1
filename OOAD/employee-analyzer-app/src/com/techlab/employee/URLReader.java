package com.techlab.employee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLReader implements IReadable {
	private String path;

	public URLReader(String path) {
		this.path = path;

	}

	@Override
	public String readFile() {
		try {
			URL url = new URL(path);
			try {
				URLConnection connection = url.openConnection();
				BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
				String inputLine;
				while ((inputLine = in.readLine()) != null)
					System.out.println(inputLine);
				in.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
