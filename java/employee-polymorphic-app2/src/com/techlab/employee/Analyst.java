package com.techlab.employee;

public class Analyst extends Employee {
	private static double PERKS = 0;

	public Analyst(int empid, String empname, double basicpay) {
		super(empid, empname, basicpay);
	}

	public double getPERKS() {
		return PERKS;
	}

	@Override
	public double calculateSalary() {
		PERKS = basicpay * 30 / 100;
		grosssalary = PERKS;
		return grosssalary;
	}


}
