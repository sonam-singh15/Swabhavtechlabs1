package com.techlab.factory;

import java.util.Map;

public interface IConfigLoader {
	Map<String, String> loadconfig(String path);

}
