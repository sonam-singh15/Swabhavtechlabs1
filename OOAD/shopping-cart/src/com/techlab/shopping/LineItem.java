package com.techlab.shopping;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;

	public LineItem(int id, String ProductName, int quantity, double unitprice) {
		this.id = id;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public int getquantity() {
		return quantity;
	}

	public Product getProduct() {
		return product;
	}

	public double calculateItemAmount() {
		double itemcount;
		itemcount = quantity;
		return itemcount;
	}

}
