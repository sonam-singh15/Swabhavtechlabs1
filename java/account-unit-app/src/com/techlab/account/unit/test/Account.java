package com.techlab.account.unit.test;

import javax.naming.InsufficientResourcesException;

public class Account {
	private String accno;;
	private String accname;
	private int balance;

	public Account(String accno, String accname, double balance) {
		this.accname = accname;
		this.accno = accno;
		this.balance = (int) balance;
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

	public double deposit(double amt) {
		return balance = (int) (balance + amt);
	}

	public double withdraw(int amt) {
		if ((balance - amt) >= 500) {
			balance = balance - amt;
		} else {
			System.out.println();
		}
		return balance;
	}

}
