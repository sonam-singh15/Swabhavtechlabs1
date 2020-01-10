package com.techlab.account.proxy.test;

public class Account {

	private String accno;;
	private String accname;
	private int balance;

	public Account(String accno, String accname, int balance) {
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;
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

	public void setAccountNo(String accno) {
		this.accno = accno;

	}

	public void setAccountName(String accname) {
		this.accname = accname;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void deposit(double amt) {
		balance = (int) (balance + amt);
	}

	public void withdraw(int amt) {
		if ((balance - amt) >= 500) {
			balance = balance - amt;
		}
	}

}
