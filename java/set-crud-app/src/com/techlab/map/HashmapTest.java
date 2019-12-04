package com.techlab.map;

import java.util.HashMap;

public class HashmapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> hashvalues = new HashMap<Integer, String>();
		hashvalues.put(1, "One");

		hashvalues.put(2, "Two");

		hashvalues.put(3, "Three");

		hashvalues.put(4, "Four");

		hashvalues.put(4, "Fo");// override

		System.out.println(hashvalues);

		System.out.println();

		System.out.println(hashvalues.get(4));

		hashvalues.putIfAbsent(5, "Five");

		System.out.println(hashvalues);

		hashvalues.containsKey(2);
		hashvalues.containsValue("Two");

		System.out.println(hashvalues);

		hashvalues.clear();

		System.out.println(hashvalues);

	}

}
