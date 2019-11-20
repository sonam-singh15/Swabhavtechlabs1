package com.techlab.account.test;

public class SavingAccount extends Account {

	final double MINIMUM_BALANCE = 500;

	public SavingAccount(int accno, String accname, double balance) {
		super(accno, accname, balance);
	}

	@Override
	public void withdraw(double amt) {
		if ((balance - amt) >= MINIMUM_BALANCE) {
			balance = balance - amt;
		} else
			System.out.println("Insufficiant balance");
	}

}
