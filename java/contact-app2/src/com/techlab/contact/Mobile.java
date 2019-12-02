package com.techlab.contact;

import java.util.ArrayList;

public class Mobile {

	private ArrayList<Contact> myContacts;

	public Mobile() {
		this.myContacts = new ArrayList<>();
	}

	public void printContacts() {
		System.out.println("You have " + myContacts.size() + " contacts in your Mobile phone.");
		for (int i = 0; i < this.myContacts.size(); i++) {
			System.out.println((i + 1) + ". " + this.myContacts.get(i).getName() + " -> "
					+ this.myContacts.get(i).getPhoneNumber());
		}
	}

	public boolean addNewContact(Contact contact) {
		if (findContact(contact.getName()) >= 0) {
			System.out.println("Contact is already on file");
			return false;
		}

		myContacts.add(contact);
		return true;
	}

	private int findContact(String contactName) {
		for (int i = 0; i < this.myContacts.size(); i++) {
			Contact contact = this.myContacts.get(i);
			if (contact.getName().equals(contactName)) {
				return i;
			}
		}
		return -1;
	}

	public Contact queryContact(String name) {
		int position = findContact(name);
		if (position >= 0) {
			return this.myContacts.get(position);
		}
		return null;
	}

}
