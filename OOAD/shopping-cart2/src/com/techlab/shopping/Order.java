package com.techlab.shopping;

import java.util.ArrayList;
import java.util.List;

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

	public List<LineItem> getItem() {
		return this.cartItems;
	}

	public void addItems(LineItem lineitem) {
		for (LineItem item1 : cartItems) {
			if (item1.getId() == lineitem.getId()) {
				lineitem.setItemQuantity(item1.getquantity() + lineitem.getquantity());
				// cartItems.remove(item1);
			}
		}

		cartItems.add(lineitem);
	}

	public double checkOut() {
		double total = 0.0;
		for (LineItem item : cartItems) {
			double checkout = item.calculateItemCost();
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

}