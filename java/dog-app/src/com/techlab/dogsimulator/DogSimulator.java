package com.techlab.dogsimulator;

import com.techlab.dog.Dog;
import com.techlab.dog.Remote;

public class DogSimulator {
	public static void main(String[] args) {
		Dog door = new Dog();
		Remote remote = new Remote();
		System.out.println("Fido barks to outside");
		remote.pressButton();

		System.out.println("fido has gone outside");
		remote.pressButton();

		System.out.println("fido all done");
		remote.pressButton();

		System.out.println("fido came inside");
		remote.pressButton();
	}

}
