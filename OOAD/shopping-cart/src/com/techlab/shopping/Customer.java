package com.techlab.shopping;

import java.util.ArrayList;

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

	public String getdate() {
		return name;
	}

	public void addOrders(Order o1) {
		orders.add(o1);
	}

	public void displayOrder() {
		for (Order elem : orders) {
			System.out
					.println("[ Customer Id :-" + id + " Customer name: " + name + "]" + "  \n[ Order details are:-\n "
							+ " Order id: " + elem.getId() + ", " + "  Order date:-" + elem.getdate() + "]");

		}

	}
}
