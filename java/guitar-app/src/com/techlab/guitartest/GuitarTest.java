package com.techlab.guitartest;

import com.techlab.guitar.Guitar;

public class GuitarTest {
	public static void main(String[] args) {

		Guitar guitars = new Guitar("A101", 450.6, "A", "Bplus", "f", "c", "d");
		printGuitarinfo(guitars);

	}

	public static void printGuitarinfo(Guitar g) {
		System.out.println("seraialno" + g.getSerialno());
		System.out.println("price" + g.getPrice());
		System.out.println("model" + g.getModel());
		System.out.println("type" + g.getType());
		System.out.println("topwood" + g.getTopWood());
		System.out.println("backwood" + g.getBackWood());
	}

}
