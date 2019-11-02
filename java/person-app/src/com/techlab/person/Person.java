package com.techlab.person;

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
		this.height = 5.5;
		this.weight = 50;
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

	public float calculateBmi() {
		float BMI = (float) (weight / (height * height));
		BMI=(float) (BMI/3.2808);
		return BMI;

	}
	public String calculateBodyCalorie()
	{
		if(calculateBmi()<18.5)
		return "Underweight";
		
		return "Normal";
		
	}

}
