package com.techlab.dog;

public class BarkRecognizer {
	private Dog door;

	public BarkRecognizer(Dog door) {
		this.door = door;
	}

	public void recognize(String bark) {
		System.out.println("Barkrecognizer" + bark);
		if (door.getAllowedBark().equals(bark))
			door.open();
		else
			System.out.println("This dog is" + "not aloowed");
	}

}
