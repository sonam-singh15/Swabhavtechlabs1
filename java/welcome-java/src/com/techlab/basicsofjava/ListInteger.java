package com.techlab.basicsofjava;

import java.util.ArrayList;

public class ListInteger {
	public static void main(String[] args) {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(12);
		arr.add(34);
		arr.add(56);
		arr.add(24);

		printAL(arr);

		if (arr.contains(24)) {
			arr.add(55);
		}
		printAL(arr);

		arr.remove(1);
		printAL(arr);

	}

	public static void printAL(ArrayList<Integer> a1) {
		for (Integer element : a1) {
			System.out.println(element + " ");
		}
		System.out.println("");

	}
}
