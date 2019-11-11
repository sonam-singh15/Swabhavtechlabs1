package com.techlab.guitar;

public class Guitar {
	private String serialno;
	private double price;
	private String builder;
	private String model;
	private String type;
	private String topwood;
	private String backwood;

	public Guitar(String serialno, double price, String builder, String model, String type, String topwood,
			String backwood) {
		this.serialno = serialno;
		this.price = price;
		this.builder = builder;
		this.model = model;
		this.type = type;
		this.topwood = topwood;
		this.backwood = backwood;

	}

	public String getSerialno() {
		return serialno;

	}

	public double getPrice() {
		return price;
	}

	public String getbuilder() {
		return builder;
	}

	public String getModel() {
		return model;
	}

	public String getType() {
		return type;
	}

	public String getTopWood() {
		return topwood;
	}

	public String getBackWood() {
		return backwood;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
