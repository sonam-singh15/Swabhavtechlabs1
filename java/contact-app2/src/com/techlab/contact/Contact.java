package com.techlab.contact;

public class Contact {

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

	public static Contact createContact(String name, String phoneNumber, String emailId) {
		return new Contact(name, phoneNumber, emailId);
	}
}
