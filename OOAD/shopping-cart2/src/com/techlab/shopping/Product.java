package com.techlab.shopping;

public class Product {
	private int id;
	private String name;
	private double cost;
	private double discount;
	private double itemCostWithDiscount;

	public Product(int id, String name, double cost, double d) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = d;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getCost() {
		return cost;
	}

	public double getDiscount() {
		return discount;
	}

	public double calculateTotalCost() {
		return itemCostWithDiscount = cost + (cost * discount);

	}

	@Override
	public String toString() {
		return "Id" + id + "name" + name + "cost" + cost + "discount" + discount + "itemCostWithDiscount"
				+ itemCostWithDiscount;

	}

}
