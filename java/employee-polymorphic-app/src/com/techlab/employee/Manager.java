package com.techlab.employee;

public class Manager extends Employee {
	private double HRA = 0;
	private double DA = 0;
	private double TA = 0;

	public Manager(int empid, String empname, double basicpay) {
		super(empid, empname, basicpay);
	}

	public double getHRA() {
		return HRA;
	}

	public double getDA() {
		return DA;
	}

	public double getTA() {
		return TA;
	}

	@Override
	public double calculateSalary() {
		HRA = basicpay * 50 / 100;
		DA = basicpay * 40 / 100;
		TA = basicpay * 30 / 100;
		grosssalary = HRA + DA + TA;
		return grosssalary;
	}

	@Override
	public String salaryInfo() {
		return "HRA:" + HRA + " DA: " + DA + " TA:" + TA;

	}

}
