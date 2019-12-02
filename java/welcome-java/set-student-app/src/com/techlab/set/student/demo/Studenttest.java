package com.techlab.set.student.demo;

import java.util.HashSet;

import com.techalab.test.Student;

public class Studenttest {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sonam", "Singh");

		Student s2 = new Student(102, "Sona", "Sinha");

		HashSet<Student> students = new HashSet<Student>();

		students.add(s1);
		students.add(s2);

		System.out.println(students.size());

	}

}
