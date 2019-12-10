package com.techlab.shopping;

public class LineItem {
	private int id;
	private int quantity;
	private Product product;

	public LineItem(int id, int quantity, Product product) {
		this.id = id;
		this.quantity = quantity;
		this.product = product;
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

	public double calculateItemCost() {
		double itemcost;
		itemcost = product.getTotalCost() * quantity;
		return itemcost;
	}

	public void setItemQuantity(int getquantity) {
		this.quantity = getquantity;
	}

	@Override
	public String toString() {
		return "[ Id :- " + id + "  quantity:- " + quantity + " product id:- " + product.getId() + " product name:- "
				+ product.getName() + " product cost :- " + product.getTotalCost() + "]";

	}

}