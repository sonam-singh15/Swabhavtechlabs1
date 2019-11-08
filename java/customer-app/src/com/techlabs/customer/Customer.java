package com.techlabs.customer;

public class Customer {
	private String name;
	private int id;
	private CardType card;
	private static int counter = 1001;

	public Customer(String name, CardType card) {
		this.name = name;
		this.card = card;
		id = counter++;
	}

	public String getName() {
		return name;
	}

	public CardType getCardType() {
		return card;
	}

	public int getId() {
		return id;
	}

}
