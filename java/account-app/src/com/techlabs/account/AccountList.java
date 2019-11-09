package com.techlabs.account;

import java.util.ArrayList;

public class AccountList {
	
	private String accno;
	private String accname;
	private double balance;
	ArrayList<AccountList>accounts=new ArrayList<AccountList>();
	
	public AccountList(String accno, String accname, double balance) {
		this.accname = accname;
		this.accno = accno;
		this.balance = balance;
	}

	public AccountList(String accno, String accname) {
		this.accname = accname;
		this.accno = accno;
		this.balance = 500;
	}
	public String getAccountName() {
		return accname;
	}

	public String getAccountNo() {
		return accno;
	}

	public double getBalance() {
		return balance;
	}

}
