package com.techlab.shopping;

import java.util.ArrayList;

public class Customer {

	private int id;
	private String name;
	private ArrayList<Order> orders;

	public int getId() {
		return id;
	}

	public String getdate() {
		return name;
	}

	public void addItems() {
		Order order = new Order(101, "12/3/2019");
		orders.add(order);
	}

}
