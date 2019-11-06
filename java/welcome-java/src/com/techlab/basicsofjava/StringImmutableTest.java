package com.techlab.basicsofjava;

public class StringImmutableTest {
	public static void main(String[] args) {
		String name = "Swabhavtechlabs";
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());

		System.out.println(name);

		String s = "Sachin";
		s = s.concat(" Tendulkar");
		System.out.println(s);

	}

}
