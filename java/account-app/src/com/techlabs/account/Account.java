package com.techlabs.account;

import java.io.Serializable;


public class Account implements Serializable {
	private String accno;;
	private String accname;
	private int balance;
	private final float MIN_BALANCE = 500;

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

	public void deposit(double amt) {
		balance = (int) (balance + amt);
	}

	public void withdraw(double amt) {
		if (balance >= amt) {
			balance = (int) (balance - amt);
		} else if (balance >= MIN_BALANCE) {
			System.out.println("Remaining balance is :-" + balance);
		} else
			System.out.println("Insufficiant balance !! opertion not possible");

	}

	@Override
	public boolean equals(Object obj) {
		Account that = (Account) obj;
		if (this.accname != that.accname)
			return false;
		if (!this.accno.equals(that.accno))
			return false;
		return true;

	}

	@Override
	public String toString() {
		String firstbit = super.toString();
		String result = "AcoountName:- " + accname + " Account no:- " + accno + " Balance:- " + balance + " Base@ "
				+ firstbit;
		return result;

	}

}
