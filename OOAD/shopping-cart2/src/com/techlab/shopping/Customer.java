package com.techlab.shopping;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	private ArrayList<Order> orders;

	public Customer(int id, String name) {
		this.id = id;
		this.name = name;
		orders = new ArrayList<Order>();
	}

	public int getId() {
		return id;
	}

	public List<Order> getOrders() {
		return this.orders;
	}

	public String getName() {
		return name;
	}

	public String getdate() {
		return getdate();
	}

	public void addOrders(Order o1) {
		if (orders != null) {
			orders.add(o1);
		}

	}

	public void displayOrder() {
		for (Order elem : orders) {
			System.out
					.println("[ Customer Id :-" + id + " Customer name: " + name + "]" + "  \n[ Order details are:-\n "
							+ " Order id: " + elem.getId() + ", " + "  Order date:-" + elem.getdate() + "]");

		}

	}
}
