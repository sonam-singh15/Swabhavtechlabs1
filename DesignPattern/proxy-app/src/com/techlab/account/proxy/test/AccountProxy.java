package com.techlab.account.proxy.test;

import java.sql.Timestamp;
import java.util.Date;

public class AccountProxy extends Account {
	Date date = new Date();

	public AccountProxy(String accno, String accname, int balance) {
		super(accno, accname, balance);
	}

	@Override
	public void deposit(double amount) {

		long time = date.getTime();
		Timestamp ts = new Timestamp(time);

		System.out.println("Display time before deposit:-" + ts);
		super.deposit(amount);
		System.out.println("Balance is:" + super.getBalance());
		System.out.println("Display time after deposit:-" + ts);
	}

}
