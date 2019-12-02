package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class AccountToStringTest {
	public static void main(String[] args) {

		Account a = new Account("101", "sonam", 5000);
		try {
			a.withdraw(4501);
		} catch (Exception e) {
			System.out.println(e.getMessage()); // polymorphic behaviour
		}
		printInfo(a);

		// System.out.println(a);

		// System.out.println(" ");

		// System.out.println(a.toString());

	}

	public static void printInfo(Account a) {
		System.out.println("Account no is:" + a.getAccountNo());
		System.out.println("Account name is:" + a.getAccountName());
		System.out.println("Account balance is " + a.getBalance());
	}

}
