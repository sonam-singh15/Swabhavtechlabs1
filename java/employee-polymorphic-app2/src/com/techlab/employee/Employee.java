package com.techlab.employee;

public abstract class Employee {
	private int empid;
	private String empname;
	protected double grosssalary;
	protected float basicpay = 20000;

	public Employee(int empid, String empname, double basicpay) {
		this.empid = empid;
		this.empname = empname;
		this.basicpay = (float) basicpay;
	}

	public int getEmpId() {
		return empid;
	}

	public String getEmpname() {
		return empname;
	}

	public double getSalary() {
		return basicpay;
	}

	abstract public double calculateSalary();


}
