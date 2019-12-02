package com.techlab.basicsofjava;

public class Sorted {
	public static void main(String[] args) {
		String[] arr = { "G", "B", "R", "R", "R", "B", "G" };

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = 0; j < (arr.length - i - 1); j++) {
				if (arr[j].compareToIgnoreCase(arr[j + 1]) > 0) {
					String temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		// Arrayrs.sort(arr);
		for (int i = arr.length - 1; i >= 0; i--)
			System.out.print(arr[i]);
		System.out.println();
	}
}