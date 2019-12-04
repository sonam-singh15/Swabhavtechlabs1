package com.techlab.map;

import java.util.TreeMap;

public class TreeMaptest {
	public static void main(String[] args) {
		TreeMap<Integer, String> treevalues = new TreeMap<Integer, String>();
		treevalues.put(01, "Lisha");
		treevalues.put(04, "Esther");
		treevalues.put(02, "Mitali");
		treevalues.put(03, "sonam");

		System.out.println(treevalues);

		System.out.println();

		treevalues.get(3);
		System.out.println(treevalues);

		if (treevalues.containsKey(3)) {
			treevalues.put(5, "anjlai");
		}

		if (treevalues.containsValue("Mitali")) {
			treevalues.put(6, "anju");

		}
		System.out.println(treevalues);

		treevalues.clear();
		System.out.println(treevalues);

	}
}
