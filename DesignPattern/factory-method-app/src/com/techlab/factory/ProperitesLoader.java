package com.techlab.factory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class ProperitesLoader implements IConfigLoader {

	@Override
	public Map<String, String> loadconfig(String path) {
		Map<String, String> config = new HashMap<String, String>();
		try {
			FileInputStream fis = new FileInputStream(path);
			Properties properties = new Properties();
			properties.load(fis);
			Enumeration<?> keys = properties.keys();
			while (keys.hasMoreElements()) {
				String key = (String) keys.nextElement();
				String value = properties.getProperty(key);
				config.put(key, value);
			}
		} catch (FileNotFoundException exception) {
			System.out.println(exception.getMessage());
		} catch (IOException exception) {
			System.out.println(exception.getMessage());
		}
		return config;
	}
}
