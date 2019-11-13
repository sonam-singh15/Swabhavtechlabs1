package com.techlab.guitartest;

import java.util.Iterator;
import java.util.List;

import com.techlab.guitar.Builder;
import com.techlab.guitar.Guitar;
import com.techlab.guitar.GuitarSpec;
import com.techlab.guitar.Inventory;
import com.techlab.guitar.Type;
import com.techlab.guitar.Wood;

public class GuitarTest {

	public static void main(String[] args) {
		Inventory inventory = new Inventory();
		initializeInventory(inventory);

		GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.CEDAR,
				Wood.CEDAR);
		List matchingGuitars = inventory.search(whatErinLikes);
		if (!matchingGuitars.isEmpty()) {
			System.out.println("Sonam, you might like these guitars:");
			for (Iterator i = matchingGuitars.iterator(); i.hasNext();) {
				Guitar guitars = (Guitar) i.next();
				GuitarSpec specs = guitars.getSpec();
				System.out.println("  We have a " + specs.getBuilder() + " " + specs.getModel() + " " + specs.getType()
						+ " guitar:\n     " + specs.getTopWood() + " back and sides,\n     " + specs.getBackWood()
						+ " top.\n  You can have it for only " + guitars.getPrice() + "\n  ----");
			}
		} else {
			System.out.println("Sorry, Sonam, we have nothing for you.");
		}
	}

	private static void initializeInventory(Inventory inventory) {
		inventory.addGuitar("11277", 3999.95, Builder.COLLINGS, "D-18", Type.ACOUSTIC, Wood.INDIAN_ROSEWOOD,
				Wood.BRAZILIAN_ROSEWOOD);
		inventory.addGuitar("V95693", 1499.95, Builder.COLLINGS, "Stratocastor", Type.ELECTRIC, Wood.CEDAR, Wood.CEDAR);
		inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor", Type.ELECTRIC, Wood.CEDAR, Wood.CEDAR);
		inventory.addGuitar("122784", 5495.95, Builder.OLSON, "D-18", Type.ACOUSTIC, Wood.MAHOGANY, Wood.MAHOGANY);
	}
}
