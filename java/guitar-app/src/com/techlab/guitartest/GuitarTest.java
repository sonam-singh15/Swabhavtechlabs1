package com.techlab.guitartest;

import com.techlab.guitar.Guitar;
import com.techlab.guitar.Inventory;
import com.techlab.guitar.Guitar.Builder;
import com.techlab.guitar.Guitar.Type;
import com.techlab.guitar.Guitar.Wood;

public class GuitarTest {
	public static void main(String[] args) {

		Inventory inventories = new Inventory();

		Guitar guitars = new Guitar("A101", 450.6, Builder.COLLINGS, "Bplus", Type.ACOUSTIC, Wood.AUSTRALIAN_REDWOOD,
				Wood.BRAZILLIAN_REDWOOD);

		Guitar guitar = inventories.search(guitars);
		printGuitarinfo(guitars);

	}

	public static void printGuitarinfo(Guitar g) {
		System.out.println("seraialno:- " + g.getSerialno());
		System.out.println("price:- " + g.getPrice());
		System.out.println("model :- " + g.getModel());
		System.out.println("type:- " + g.getType());
		System.out.println("topwood:- " + g.getTopWood());
		System.out.println("backwood:- " + g.getBackWood());
	}

}
