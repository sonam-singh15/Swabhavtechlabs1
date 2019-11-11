package com.techlab.basicsofjava;

import java.util.ArrayList;

public class CodeMagnet6 {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		System.out.println("ArrayList Integer");
		arr.add(0, "zero");
		arr.add(1, "one");
		arr.add(2, "two");
		arr.add(3, "three");

		System.out.println("Reading values");
		printAL(arr);

		System.out.println("Searching");
		if (arr.contains("three")) {
			arr.add("four");
		}
		if (arr.indexOf("four") != 4) {
			arr.add(4, "4.2");
		}
		printAL(arr);

		System.out.println("Deletion");
		arr.remove(2);
		printAL(arr);

		System.out.println("Updation");
		arr.set(2, "five");
		printAL(arr);

	}

	public static void printAL(ArrayList<String> a1) {
		for (String element : a1) {
			System.out.println(element + " ");
		}
		System.out.println("");

	}

}
