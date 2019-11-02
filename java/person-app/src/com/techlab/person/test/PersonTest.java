package com.techlab.person.test;

import com.techlab.person.GenderOption;
import com.techlab.person.Person;

public class PersonTest {
	public static void main(String[] args) {
		Person p = new Person("Sonam", GenderOption.FEMALE, 24, 48, 5.6);

		p.eat();
		p.workout();
		printInfo(p);

		System.out.println("   ");

		Person p1 = new Person("Anjali", 22);
		printInfo(p1);

		p.workout();

	}

	public static void printInfo(Person p) {
		System.out.println("name:-" + p.getName());
		System.out.println("age :- " + p.getAge());
		System.out.println("height:- " + p.getHeight());
		System.out.println("weight:- " + p.getWeight());
		System.out.println("gender:- " + p.getGender());
		System.out.println("Person is :- " +p.calculateBodyCalorie());
	    System.out.print("\nThe Body Mass Index (BMI) is " +p.calculateBmi()+ " kg/m2");
        

	}

}
