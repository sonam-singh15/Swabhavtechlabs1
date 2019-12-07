                                                                                                                                                      package com.techlab.dog;

public class BarkRecognizer {
	private Dog door;

	public BarkRecognizer(Dog door) {
		this.door = door;
	}

	public void recognize(Bark bark) {
		System.out.println("\n barkrecgnizer heard is" + bark.getSound());
		if (door.getAllowedBark().equals(bark)) {
			door.open();
		} else {
			System.out.println("This dog is" + " not allowed");
		}
	}

}
