package com.techlab.dog;

public class BarkRecognizer {
	private Dog door;

	public BarkRecognizer(Dog door) {
		this.door = door;
	}

	public void recognize(String bark) {
		System.out.println("Barkrecognizer" + bark);
		door.open();
	}

}
