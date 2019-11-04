package com.techlab.person;

import java.lang.Math;

public class Person {
	private String name;
	private int age;
	private float weight;
	private double height;
	private GenderOption gender;
	private int feet;
	private int inches;

	public Person(String name, GenderOption gender, int age, float weight, double height, int feet, int inches) {
		this.name = name;
		this.age = age;
		this.feet = feet;
		this.height = height;
		this.inches = inches;
		this.weight = weight;
		this.gender = gender;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.height = 5.5;
		this.weight = 90;
		this.gender = GenderOption.MALE;
	}

	public String getName() {
		return name;
	}

	public GenderOption getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public double getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public void workout() {
		weight = (float) (weight - (weight * 0.2));

	}

	public void eat() {
		weight = weight + (weight * 5) / 100;
		height = height + (height * 25) / 100;
	}

	public double calculateBmi() {
		double weightInKilos = weight * 0.453592;
		double heightInMeters = (((feet * 12) + inches) * 0.254);
		double BMI = weightInKilos / Math.pow(heightInMeters, 2.0);
		return BMI;

	}

	public String calculateBodyCalorie() {
		if (calculateBmi() < 18.5)
			return "Underweight";
		else if (calculateBmi() >= 18.5 && calculateBmi() < 25)
			return "Normal";
		else if (calculateBmi() >= 25 && calculateBmi() < 30)
			return "Overweight";

		return "obese";

	}

}
