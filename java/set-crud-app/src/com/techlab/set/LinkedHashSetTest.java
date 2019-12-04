package com.techlab.set;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedHashSetTest {
	public static void main(String[] args) {

		LinkedHashSet<String> linkedset = new LinkedHashSet<String>();
		// add
		linkedset.add("Bindra");
		linkedset.add("Anjali");
		linkedset.add("Dalveer");
		linkedset.add("Captain");

		for (String elem : linkedset) {
			System.out.println(elem);
		}

		System.out.println();
//remove
		linkedset.remove("Captain");
		for (String elem : linkedset) {
			System.out.println(elem);
		}

	}
}
