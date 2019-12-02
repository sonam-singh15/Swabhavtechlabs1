package com.techlabs.accounttest;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.techlabs.account.Account;

public class DeserializeTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Account a = new Account("101", "Sonam", 5000);
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\Swabhav\\Desktop\\example.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			a = (Account) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		}
		System.out.println("Deserialized Employee...");
		System.out.println("Name: " + a.getAccountName());
		System.out.println("Address: " + a.getAccountNo());
		System.out.println("SSN: " + a.getBalance());
	}

}
