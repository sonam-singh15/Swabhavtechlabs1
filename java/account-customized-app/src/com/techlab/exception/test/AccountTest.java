package com.techlab.exception.test;

import com.techlab.exception.Account;
import com.techlab.exception.InsufficiantFundException;

public class AccountTest {
	public static void main(String[] args) {

		Account a = new Account("101", "sonam", 5000);
		try {
			a.withdraw(4501);
			printInfo(a);

		} catch (InsufficiantFundException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void printInfo(Account a) {
		System.out.println("Account no is:" + a.getAccountNo());
		System.out.println("Account name is:" + a.getAccountName());
		System.out.println("Account balance is " + a.getBalance());
	}

}
