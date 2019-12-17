package com.techlab.srp.violation;

public class Invoice {
	private int id;
	private String name;
	public double amount;
	private float discountPercentage;
	private static final float GST = 0.125f;

	public Invoice(int id, String name, double amount, float discountPercentage) {
		this.id = id;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public float getDiscount() {
		return discountPercentage;
	}

	public double calculateDiscount() {
		return this.amount - (this.amount * (this.discountPercentage / 100.0f));
	}

	public double calculateGst() {

		return this.calculateDiscount() + GST;

	}

	public double calculateTotalCost() {
		double discountPrice = calculateDiscount();
		double gstPrice = calculateGst();
		return discountPrice + gstPrice;

	}

	public void printInvoice(Invoice invoice) {
		System.out.println(" Id :-" + invoice.id);
		System.out.println(" Name :-" + invoice.name);
		System.out.println(" Amount :-" + invoice.amount);
		System.out.println(" CostAfterDiscount :-" + invoice.calculateDiscount());
		System.out.println("CostAfterGst :-" + invoice.calculateGst());
		System.out.println("TotalCost :-" + invoice.calculateTotalCost());
	}

}
