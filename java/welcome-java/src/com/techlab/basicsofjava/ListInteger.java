package com.techlab.basicsofjava;

import java.util.ArrayList;

public class ListInteger {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();

		System.out.println("ArrayList Integer");
		arr.add(12);
		arr.add(34);
		arr.add(56);
		arr.add(24);

		System.out.println("Reading values");
		printAL(arr);

		System.out.println("Searching");
		if (arr.contains(24)) {
			arr.add(55);
		}
		printAL(arr);

		System.out.println("Deletion");
		arr.remove(1);

		System.out.println("Updation made in arraylist");
		arr.set(1, 28);
		printAL(arr);

	}

	public static void printAL(ArrayList<Integer> a1) {
		for (Integer element : a1) {
			System.out.println(element + " ");
		}
		System.out.println("");

	}
}
