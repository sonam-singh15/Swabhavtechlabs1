package com.techlab.shopping;

public class LineItem {
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

	public void setItemQuantity(int getquantity) {
		this.quantity = getquantity;
	}

	@Override
	public String toString() {
		return "[ Id :- " + id + " name:- " + name + " quantity:- " + quantity + " Cost :-" + itemcost + "]";

	}

}
