package com.techlab.ocp;

public class FixedDeposit {

	private int id;
	private String name;
	private double principleamount;
	private int years;
	private FestivalType festival;

	public FixedDeposit(int id, String name, double principleamount, int years, FestivalType festival) {
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

	public float getRate(FestivalType festival) {
		switch (festival) {
		case NORMAL:
			return 0.7f;
		case HOLI:
			return 0.08f;
		case DIWALI:
			return 0.09f;
		}
		return 0.07f;

	}

	public double calculateSimpleinterest() {

		double SI = (principleamount * years * getRate(festival)) / 100;
		return SI;

	}

}
