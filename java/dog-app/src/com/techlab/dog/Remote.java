package com.techlab.dog;

public class Remote {

	private Dog door;

	public Remote(Dog door) {
		this.door = door;
	}

	public void pressButton() {
		System.out.println("pressing button");
		if (door.isOpen())
			door.close();
		else
			door.open();

	}
}
