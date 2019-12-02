
package com.techlab.contact.test;

import java.util.Scanner;

import com.techlab.contact.Contact;
import com.techlab.contact.ContactManager;

public class MobileInterface {

	private static Scanner scanner = new Scanner(System.in);

	private static ContactManager mobilePhone = new ContactManager();

	public static void main(String[] args) throws ClassNotFoundException {
		boolean quit = false;
		startPhone();
		printActions();

		while (!quit) {
			System.out.println("\nEnter action: (5 for menu)\n");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				addNewContact();
				break;
			case 1:
				searchContact();
				break;
			case 2:
				mobilePhone.printContacts();
				mobilePhone.store();
				mobilePhone.retrive();
				break;
			case 3:
				printActions();
				break;

			}
		}

	}

	private static void startPhone() {
		System.out.println("Starting Phone");
	}

	private static void printActions() {
		System.out.println("\nAvailable actions:\npress");
		System.out.println("0-to print a list of available actions\n 1 - to add a new contact \n"
				+ "2- query if an existing contact exists\n" + "3 -to print contacts\n");
		System.out.println("Choose your action: ");

	}

	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phone = scanner.nextLine();
		System.out.println("Enter emailid number: ");
		String emailid = scanner.nextLine();

		Contact newContact = Contact.createContact(name, phone, emailid);
		if (mobilePhone.addNewContact(newContact)) {
			System.out.println("New contact added: " + name + ", number: " + phone + ", emailid" + emailid);
		} else {
			System.out.println("Cannot add, " + name + " already in file");
		}

	}

	private static void searchContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.searchContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Name: " + existingContactRecord.getName() + " phone number is "
				+ existingContactRecord.getPhoneNumber());
	}

}