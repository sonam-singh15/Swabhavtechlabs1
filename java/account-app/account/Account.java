package com.techlabs.account;

import java.io.Serializable;

public class Account implements Serializable {
	private String accno;;
	private String accname;
	private double balance;
	private final float MIN_BALANCE = 500;
	private static final long serialVersionUID = 1L;
	private transient int nonSerializeValueSalary;


	public int getNonSerializeValueSalary() {
		return nonSerializeValueSalary;
	}

	public void setNonSerializeValueSalary(int nonSerializeValueSalary) {
		this.nonSerializeValueSalary = nonSerializeValueSalary;
	}

	public Account(String accno, String accname, double balance) {
		this.accname = accname;
		this.accno = accno;
		this.balance = balance;
	}

	public Account(String accno, String accname) {
		this.accname = accname;
		this.accno = accno;
		this.balance = 500;
	}

	public String getAccountName() {
		return accname;
	}

	public String getAccountNo() {
		return accno;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amt) {
		balance = balance + amt;
	}

	public void withdraw(double amt) {
		if (balance >= amt) {
			balance = balance - amt;
		} else if (balance >= MIN_BALANCE) {
			System.out.println("Remaining balance is :-" + balance);
		} else
			System.out.println("Insufficiant balance !! opertion not possible");

	}

}
