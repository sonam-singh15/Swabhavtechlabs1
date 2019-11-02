package com.techlab.person.copy;

public class Person {
	private String name;
	private int age;
	private float weight;
	private double height;
	private GenderOption gender;

	public Person(String name, GenderOption gender, int age, float weight, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.gender = gender;
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		this.height=5.5;
		this.weight=50;
		this.gender=GenderOption.MALE;
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

}
