package com.techlab.account.test;

public class CurrentAccount extends Account {

	private static final double MINIMUM_BALANCE = 500;
	private static final double OVERDRAFT = 10000;

	public CurrentAccount(int accno, String accname, double balance) {
		super(accno, accname, balance);
	}

	@Override
	public void withdraw(double amt) {
		if ((balance - amt) >= MINIMUM_BALANCE) {
			balance = balance - amt;
		} else if (balance <= 0)
			balance = balance + OVERDRAFT;
		System.out.println("Overdraft balance is:" + balance);
	}

}
