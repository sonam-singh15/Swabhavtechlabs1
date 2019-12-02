package com.techlab.student;

public class Professor extends Person implements SalariedEmployee {
	private double HRA = 0;
	private double DA = 0;
	private double TA = 0;
	protected double grosssalary;
	private float basicpay = 20000;

	public Professor(int id, String address, String dob) {
		super(id, address, dob);
	}

	public double calculateSalary() {
		HRA = basicpay * 50 / 100;
		DA = basicpay * 40 / 100;
		TA = basicpay * 30 / 100;
		grosssalary = HRA + DA + TA;
		return grosssalary;
	}

}
