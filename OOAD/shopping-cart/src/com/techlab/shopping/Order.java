package com.techlab.shopping;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Order {
	private int id;
	private String date;
	private ArrayList<LineItem> cartItems;

	public Order(int id, String date) {
		this.id = id;
		this.date = date;
		cartItems = new ArrayList<LineItem>();
	}

	public int getId() {
		return id;
	}

	public String getdate() {
		return date;
	}

	public void addItems(LineItem lineitem) {
		if (cartItems != null) {
			cartItems.add(lineitem);
		}

	}

	public double checkOut() {
		double total = 0;
		for (LineItem item : cartItems) {
			double checkout = item.getItemCost() * item.getquantity();
			total = total + checkout;
		}
		return total;
	}

	public void displayItem() {
		System.out.println(cartItems.size() + "items");
		for (LineItem item : cartItems) {
			System.out.println(item.toString());
		}

	}

	public void writeIntofile(LineItem lineitem) throws IOException {
		FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Swabhav\\Desktop\\demo.txt");
		ObjectOutputStream out = new ObjectOutputStream(fileOut);
		out.writeObject(lineitem);
		out.close();
		fileOut.close();

	}

	public void modifyItem(LineItem lineitem) {
		boolean itemFound = false;
		if (cartItems != null) {
			for (LineItem item1 : cartItems) {
				if (item1.getName().equals(item1.getName())) {
					itemFound = true;

					if (item1.getquantity() != 0) {
						lineitem.setItemQuantity(item1.getquantity() + lineitem.getquantity());
					}
				}
				// System.out.println(lineitem.getquantity());
			}

			if (itemFound != true) {
				System.out.println("Item not found in cart. Nothing modified");
			}

		}

	}
}
