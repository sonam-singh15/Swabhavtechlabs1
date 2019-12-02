package com.techlab.set;

import java.util.HashSet;

public class HashsetTest {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet<String>();

		names.add("lisha");
		names.add("anjali");
		names.add("sarita");
		names.add("sakshi");

		for (String elem : names) {
			System.out.println(elem);

		}

		System.out.println();
		//names.add("sakshi");//accepts unique values

		// update
		names.remove("anjali");
		names.add("sona");
		for (String elem : names) {
			System.out.println(elem);

		}

		System.out.println();
		// remove
		names.remove("sakshi");
		for (String elem : names) {
			System.out.println(elem);

		}

	}

}
