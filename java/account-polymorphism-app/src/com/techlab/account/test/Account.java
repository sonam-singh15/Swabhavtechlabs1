package com.techlab.account.test;

public abstract class Account {
	private int accno;
	private String accname;
	protected double balance;

	public Account(int accno, String accname, double balance) {
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;

	}

	public int getAccno() {
		return accno;
	}

	public String getAccName() {
		return accname;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double newbalance) {
		balance = balance + newbalance;
	}

	abstract public void withdraw(double balance);

}
