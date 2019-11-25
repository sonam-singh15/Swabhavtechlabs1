package com.techlab.contact;

import java.io.Serializable;

public class Contact implements Serializable {

	private String name;
	private String phoneNumber;
	private String emailId;

	public Contact(String name, String phoneNumber, String emailId) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.emailId = emailId;
	}

	public String getName() {
		return name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public String getEmailId() {
		return emailId;
	}

	public static Contact createContact(String name, String phoneNumber, String emailId) {
		return new Contact(name, phoneNumber, emailId);
	}

	public String toString() {
		return "name=" + name + ", Phonenumber=" + phoneNumber + ", emailid=" + emailId;
	}
}
