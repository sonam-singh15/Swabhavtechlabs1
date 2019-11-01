package com.techlab.basicsofjava;

import java.util.ArrayList;

public class CodeMagnet6 {
	public static void main(String[] args) {

		ArrayList<String> arr = new ArrayList<String>();
		arr.add(0, "zero");
		arr.add(1, "one");
		arr.add(2, "two");
		arr.add(3, "three");
		printAL(arr);

		if (arr.contains("three")) {
			arr.add("four");
		}
		arr.remove(2);
		printAL(arr);

		if (arr.indexOf("four") != 4) {
			arr.add(4, "4.2");
		}
		printAL(arr);

		if (arr.contains("two")) {
			arr.add("2.2");
		}
		printAL(arr);

	}

	public static void printAL(ArrayList<String> a1) {
		for (String element : a1) {
			System.out.println(element + " ");
		}
		System.out.println("");

	}

}
