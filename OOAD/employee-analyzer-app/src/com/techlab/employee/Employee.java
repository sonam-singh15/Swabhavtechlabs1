package com.techlab.employee;

public class Employee {
	private int empid;
	private String empname;
	private static String designation;
	private static int managerid;
	private static String dateOfJoining;
	private static String commission;
	private static double salary;
	private static int departmentNumber;

	public Employee(int empid, String empname, String designation, int managerid, String dateOfjoining, double salary,
			String commission, int departmentNumber) {
		this.empid = empid;
		this.empname = empname;
		this.designation = designation;
		this.managerid = managerid;
		this.dateOfJoining = dateOfjoining;
		this.commission = commission;
		this.salary = salary;
		this.departmentNumber = departmentNumber;
	}

	public int getEmpId() {
		return empid;
	}

	public void setId(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesignation() {
		return designation;

	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getManagerId() {
		return managerid;
	}

	public void setMangerId(int managerid) {
		this.managerid = managerid;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getComisiion() {
		return commission;
	}

	public void setComission(String commission) {
		this.commission = commission;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartNo(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	
}
