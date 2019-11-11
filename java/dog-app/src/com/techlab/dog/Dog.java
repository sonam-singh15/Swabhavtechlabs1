package com.techlab.dog;

public class Dog {
	private boolean open;

	public Dog() {
		this.open = false;
	}

	public void open() {
		System.out.println("Door is open");
		open = true;
	}

	public void close() {
		System.out.println("Door is close");
		open = false;
	}

	public boolean isOpen() {
		return open;
	}

}
