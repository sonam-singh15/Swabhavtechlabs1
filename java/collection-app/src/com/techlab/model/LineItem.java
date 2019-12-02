package com.techlab.model;

public class LineItem {
	private int id;
	private String ProductName;
	private int quantity;
	private double unitprice;

	public int getId() {
		return id;
	}

	public String getProductName() {
		return ProductName;
	}

	public int getquantity() {
		return quantity;
	}

	public double getunitprice() {
		return unitprice;
	}

	public LineItem(int id, String ProductName, int quantity, double unitprice) {
		this.id = id;
		this.ProductName = ProductName;
		this.quantity = quantity;
		this.unitprice = unitprice;
	}

}
