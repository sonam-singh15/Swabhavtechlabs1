package com.techlab.guitartest;

import com.techlab.guitar.Inventory;
import com.techlab.guitar.Builder;
import com.techlab.guitar.Guitar.Type;
import com.techlab.guitar.Guitar.Wood;

public class GuitarTest {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "CJ", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD,
				Wood.BRAZILLIAN_REDWOOD);
		inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.AUSTRALIAN_REDWOOD,
				Wood.BRAZILLIAN_REDWOOD);
	}
}