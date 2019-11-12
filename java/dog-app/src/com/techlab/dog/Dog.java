package com.techlab.dog;

public class Dog {
	private boolean open;
	private String allowedbark;

	public Dog() {
		this.open = false;
	}

	public String getAllowedBark() {
		return allowedbark;
	}

	public void setAllowedBark(String bark) {
		this.allowedbark = bark;
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
