package com.techlab.employee;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader implements IReadable {
	private String path;

	public FileReader(String path) {
		this.path = path;

	}

	@Override
	public String readFile() {
		File file = new File(path);
		try {
			FileInputStream fis = new FileInputStream(file);
			byte[] bytes = new byte[(int) file.length()];
			try {
				int bytereads = fis.read(bytes, 0, bytes.length);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		return null;
	}

}
