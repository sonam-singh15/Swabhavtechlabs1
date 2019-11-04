package com.techlabs.accounttest;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a = new Account("101", "Sonam", 5000);

		a.deposit(0);
		printInfo(a);
		a.withdraw(4501);

		System.out.println("   ");

		Account a1 = new Account("102", "Anjali");
		printInfo(a1);

	}

	public static void printInfo(Account a) {
		System.out.println("name :-" + a.getAccountName());
		System.out.println("Account no :-" + a.getAccountNo());
		System.out.println("balance :-" + a.getBalance());

		;

	}

}
