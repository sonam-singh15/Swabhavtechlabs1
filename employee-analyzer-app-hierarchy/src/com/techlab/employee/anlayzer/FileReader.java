package com.techlab.employee.anlayzer;

import java.io.*;

public class FileReader implements IReadable {

	private String path;

	public FileReader(String path) {
		this.path = path;
	}

	@Override
	public String readFile() {
		return new String(readFileBytes());
	}

	@Override
	public byte[] readFileBytes() {
		try {
			File file = new File(path);
			if (!file.exists()) {
				throw new FileNotFoundException("file not found");
			}
			if (!file.isFile()) {
				return new byte[0];
			}
			FileInputStream fis = new FileInputStream(file);
			byte[] bytes = new byte[(int) file.length()];
			int bytesRead = fis.read(bytes, 0, bytes.length);
			if (bytesRead != bytes.length) {
				throw new IOException();
			}
			return bytes;
		} catch (FileNotFoundException exception) {
			System.out.println(exception);
			return new byte[0];
		} catch (IOException exception) {
			System.out.println(exception);
			return new byte[0];
		}
	}

}
