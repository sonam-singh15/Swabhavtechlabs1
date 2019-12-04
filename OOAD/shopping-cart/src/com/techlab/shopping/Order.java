package com.techlab.shopping;

import java.util.ArrayList;

public class Order {
	private int id;
	private String date;
	private ArrayList<LineItem> items;

	public Order(int id, String date) {
		this.id = id;
		this.date = date;
		items = new ArrayList<LineItem>();
	}

	public int getId() {
		return id;
	}

	public String getdate() {
		return date;
	}

	public void addItems(LineItem item) {
		LineItem order = new LineItem(101, "Shoes", 02, 300);
		items.add(order);
	}

}
