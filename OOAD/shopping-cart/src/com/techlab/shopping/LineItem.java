package com.techlab.shopping;

import java.io.Serializable;

public class LineItem implements Serializable {
	private int id;
	private int quantity;
	private String name;
	private Product product;
	private double itemcost;

	public LineItem(int id, String ProductName, int quantity, double unitprice) {
		this.id = id;
		this.name = ProductName;
		this.quantity = quantity;
		itemcost = quantity * unitprice;
	}

	public int getId() {
		return id;
	}

	public int getquantity() {
		return quantity;
	}

	public double getItemCost() {
		return itemcost;
	}

	public String getName() {
		return name;
	}

	public Product getProduct() {
		return product;
	}

	@Override
	public String toString() {
		return "[ Id :- " + id + " name:- " + name + " quantity:- " + quantity + " Cost :-" + itemcost + "]";

	}
}
