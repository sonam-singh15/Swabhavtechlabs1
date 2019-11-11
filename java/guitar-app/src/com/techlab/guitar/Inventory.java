package com.techlab.guitar;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.techlab.guitar.Guitar.Builder;
import com.techlab.guitar.Guitar.Type;
import com.techlab.guitar.Guitar.Wood;

public class Inventory {
	private List guitars;

	public Inventory() {
		guitars = new LinkedList();
	}

	public Inventory(String serialno, double price, Builder builder, String model, Type type, Wood topwood,
			Wood backwood) {
		Guitar guitar = new Guitar(serialno, price, builder, model, type, topwood, backwood);
		guitars.add(guitar);
	}

	public Guitar getGuitar(String serialno) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			if (guitar.getSerialno().equals(serialno)) {
				return guitar;
			}

		}
		return null;

	}

	public Guitar search(Guitar searchGuitar) {
		for (Iterator i = guitars.iterator(); i.hasNext();) {
			Guitar guitar = (Guitar) i.next();
			Builder builder = searchGuitar.getbuilder();
			if ((builder != null) && (!builder.equals("")) && (!builder.equals(guitar.getbuilder())))
				continue;
			String model = searchGuitar.getModel();
			if ((model != null) && (!model.equals("")) && (!builder.equals(guitar.getModel())))
				continue;
			Type type = searchGuitar.getType();
			if ((type != null) && (!type.equals("") && (!type.equals(guitar.getType()))))
				continue;

		}
		return null;
	}
}
