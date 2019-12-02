package com.techlab.employee;

public class Developer extends Employee {
	private static double BONUS = 0;
	private static double PA = 0;

	public Developer(int empid, String empname, double basicpay) {
		super(empid, empname, basicpay);
	}

	public double getBONUS() {
		return BONUS;
	}

	public double getPA() {
		return PA;
	}

	@Override
	public double calculateSalary() {
		BONUS = basicpay * 40 / 100;
		PA = basicpay * 30 / 100;
		grosssalary = BONUS + PA;
		return grosssalary;
	}


}
