package com.techlab.map;

import java.util.LinkedHashMap;

public class LinkedHashMapTest {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedvalues = new LinkedHashMap<Integer, String>();
		linkedvalues.put(01, "Lisha");
		linkedvalues.put(04, "Esther");
		linkedvalues.put(02, "Mitali");
		linkedvalues.put(03, "sonam");

		System.out.println(linkedvalues);

		String val = linkedvalues.get(3);
		System.out.println(val);

		linkedvalues.clear();
		System.out.println(linkedvalues);

	}
}
