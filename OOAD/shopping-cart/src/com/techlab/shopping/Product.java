package com.techlab.shopping;

public class Product {
	private int id;
	private String name;
	private double cost;
	private float discount;

	public Product(int id, String name, double cost, float discount) {
		this.id = id;
		this.name = name;
		this.cost = cost;
		this.discount = discount;
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

	public double calculateFinalAmount() {
		double totalcost;
		totalcost = cost * discount;
		return totalcost;

	}

}
