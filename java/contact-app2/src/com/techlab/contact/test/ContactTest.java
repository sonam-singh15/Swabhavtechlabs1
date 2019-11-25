package com.techlab.contact.test;

import java.util.Scanner;

import com.techlab.contact.Contact;
import com.techlab.contact.Mobile;

public class ContactTest {

	private static Scanner scanner = new Scanner(System.in);

	private static Mobile mobilePhone = new Mobile();

	public static void main(String[] args) {
		boolean quit = false;
		startPhone();
		printActions();
		while (!quit) {
			System.out.println("\nEnter action: (6 for menu)\n");
			int action = scanner.nextInt();
			scanner.nextLine();

			switch (action) {
			case 0:
				mobilePhone.printContacts();
				break;
			case 1:
				addNewContact();
				break;
			case 2:
				updateContact();
				break;
			case 3:
				removeContact();
				break;
			case 4:
				queryContact();
				break;
			case 5:
				printActions();
				break;
			}
		}
	}

	private static void startPhone() {
		System.out.println("Starting Phone...");
	}

	private static void printActions() {
		System.out.println("\nAvailable actions:\npress");
		System.out.println("0 - to shutdown\n" + "1 - to print contacts\n" + "2 - to add a new contact\n"
				+ "3 - to update an existing contact\n" + "4 - to remove an existing contact\n"
				+ "5 - query if an existing contact exists\n" + "6 - to print a list of available actions\n");
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

	private static void updateContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		System.out.println("Enter new contact name: ");
		String newName = scanner.nextLine();
		System.out.println("Enter new contact phone number: ");
		String newNumber = scanner.nextLine();

		Contact newContact = Contact.createContact(newName, newNumber, newNumber);
		if (mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updated record");
		} else {
			System.out.println("Error updating record");
		}

	}

	private static void removeContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		if (mobilePhone.removeContact(existingContactRecord)) {
			System.out.println("Successfully removed contact");
		} else {
			System.out.println("Error while removing record");
		}
	}

	private static void queryContact() {
		System.out.println("Enter existing contact name: ");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}
		System.out.println("Name: " + existingContactRecord.getName() + " phone number is "
				+ existingContactRecord.getPhoneNumber());
	}

}