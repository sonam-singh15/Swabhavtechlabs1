package com.techlab.student.test;

import com.techlab.student.Person;
import com.techlab.student.Professor;
import com.techlab.student.Student;

public class Persontest {
	public static void main(String[] args) {

		System.out.println("Student information:");
		Person p1 = new Student(101, "Pune", "10/5/97", "IT");
		printInfo(p1);

		System.out.println();

		System.out.println("Professor information");
		Person p2 = new Professor(110, "Kolkata", "15/7/90");
		printInfo(p2);

	}

	public static void printInfo(Person p) {
		System.out.println("Person id is:" + p.getId());
		System.out.println("Person address is:" + p.getAddress());
		System.out.println("Person Date of birth is: " + p.getDob());
		if (p instanceof Professor) {
			Professor m = (Professor) p;
			System.out.println("Manager salary :- " + m.calculateSalary());
		}
		if (p instanceof Student) {
			Student m = (Student) p;
			System.out.println("Student's branch:- " + m.getbranch());
		}

	}
}
