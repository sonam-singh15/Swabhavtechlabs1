package com.techlab.accountpoly;

import com.techlab.account.test.Account;
import com.techlab.account.test.CurrentAccount;
import com.techlab.account.test.SavingAccount;

public class AccountTest {
	public static void main(String[] args) {
		SavingAccount account1 = new SavingAccount(1045, "Sonam", 400);
		account1.deposit(100);
		account1.withdraw(100);
		System.out.println("Saving account details:- ");
		printInfo(account1);

		CurrentAccount account2 = new CurrentAccount(2245, "Anjali", 1200);
		account2.deposit(0);
		account2.withdraw(1200);
		System.out.println("current account details are:- ");
		printInfo(account2);
	}

	public static void printInfo(Account accounts) {
		System.out.println("Account no is:" + accounts.getAccno());
		System.out.println("Account name is:" + accounts.getAccName());
		System.out.println("Account balance is " + accounts.getBalance());
	}
}
