package com.techlabs.accounttest;

import java.util.ArrayList;

import com.techlabs.account.Account;

public class AccountListTest {
	public static void main(String[] args) {
		
		ArrayList<Account>accounts=new ArrayList<Account>();
		Account a = new Account("101", "Sonam", 5000);
		accounts.add(a);;

		a.deposit(0);
		printInfo(a);
		a.withdraw(4500);

		System.out.println("   ");

}
	public static void printInfo(Account a) {
		
	
	}
}

