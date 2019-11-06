package com.techlabs.accounttest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.techlabs.account.Account;

public class AccountTest {
	public static void main(String[] args) {
		Account a = new Account("101", "Sonam", 5000);

		a.deposit(0);
		printInfo(a);
		a.withdraw(4500);

		System.out.println("   ");

		Account a1 = new Account("102", "Anjali");
		printInfo(a1);

		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Swabhav\\Desktop\\example.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(a);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved ");
		} catch (IOException i) {
			i.printStackTrace();
		}
		System.out.println("   ");
		printInfo(a);

	}

	public static void printInfo(Account a) {
		System.out.println("name :-" + a.getAccountName());
		System.out.println("Account no :-" + a.getAccountNo());
		System.out.println("balance :-" + a.getBalance());

	}

}
