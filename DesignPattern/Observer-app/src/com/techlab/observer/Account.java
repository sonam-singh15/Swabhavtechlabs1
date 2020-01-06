package com.techlab.observer;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private int accNo;
	private String accName;
	private double balance;
	private String emailID;
	private int mobileNo;
	private List<IBalnceObserver> subscribers = new ArrayList<IBalnceObserver>();

	public Account(int accNo, String accName, double balance, String emailId, int mobileNo) {
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
		this.emailID = emailId;
		this.mobileNo = mobileNo;
	}

	public int getAccno() {
		return accNo;
	}

	public String getAccname() {
		return accName;
	}

	public double getBalnce() {
		return balance;
	}

	public String getEmailId() {
		return emailID;
	}

	public int getMobileNo() {
		return mobileNo;
	}

	public void setAccno(int accNo) {
		this.accNo = accNo;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public List<IBalnceObserver> getSubscriber() {
		return subscribers;
	}

	public void addObserver(IBalnceObserver observers) {
		subscribers.add(observers);
	}

	public void deposit(double amount) {
		balance = balance + amount;
		for (IBalnceObserver obj : subscribers) {
			obj.update(this);

		}
	}

	public void withdraw(double amount) {
		if ((balance - amount) > 0) {
			balance = balance - amount;
			for (IBalnceObserver obj : subscribers) {
				obj.update(this);
			}
		}

	}
}
