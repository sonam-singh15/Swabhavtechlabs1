package com.techlab.soliddemo;

public class Penguin extends Bird {

	public Penguin() {
		super.setFlyable(false);
	}

	@Override
	public void fly() {
		System.out.println("I'm flying high, across the mountain !");
	}

}
