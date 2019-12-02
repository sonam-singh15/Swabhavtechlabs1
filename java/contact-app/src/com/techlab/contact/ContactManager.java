package com.techlab.contact;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ContactManager {

	private ArrayList<Contact> myContacts;

	public ContactManager() {
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

	public Contact searchContact(String name) {
		int position = findContact(name);
		if (position >= 0) {
			return this.myContacts.get(position);
		}
		return null;
	}

	public void store() {
		try {
			FileOutputStream fileOut = new FileOutputStream("C:\\Users\\Swabhav\\Desktop\\example.txt");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(myContacts);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved \n ");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}

	public void retrive() throws ClassNotFoundException {
		try {
			FileInputStream fileIn = new FileInputStream("C:\\Users\\Swabhav\\Desktop\\example.txt");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			myContacts = (ArrayList<Contact>) in.readObject();
			in.close();
			fileIn.close();
		} catch (IOException i) {
			i.printStackTrace();
			return;
		}
		System.out.println("Deserialized Mobile information...");
		for (Contact tmp : myContacts) {
			System.out.println(tmp);
		}
	}
}
