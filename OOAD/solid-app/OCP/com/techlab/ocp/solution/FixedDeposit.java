package com.techlab.ocp.solution;

public class FixedDeposit {

	private int id;
	private String name;
	private double principleamount;
	private int years;
	private IFestivalRate festival;

	public FixedDeposit(int id, String name, double principleamount, int years, IFestivalRate festival) {
		this.id = id;
		this.name = name;
		this.principleamount = principleamount;
		this.years = years;
		this.festival = festival;

	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;

	}

	public double getPrincipleamount() {
		return principleamount;
	}

	public int getyears() {
		return years;
	}

	public double calculateSimpleinterest() {

		double SI = (principleamount * years * festival.getRate()) / 100;
		return SI;

	}

}
