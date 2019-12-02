package com.techlab.set;

import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {

		TreeSet<String> names = new TreeSet<String>();
		names.add("sonam");
		names.add("anjali");
		names.add("sarita");
		names.add("sakshi");

		for (String elem : names) {
			System.out.println(elem);
		}

		names.add("sakshi");// accepts unique value
		System.out.println();

		names.remove("sakshi");
		names.add("abhi");
		for (String elem : names) {
			System.out.println(elem);
		}

		System.out.println();

		names.remove("sonam");
		for (String elem : names) {
			System.out.println(elem);
		}

	}
}
