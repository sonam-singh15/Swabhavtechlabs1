package com.techlab.set.student.demo;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;
import com.techalab.test.FirstNameSorter;
import com.techalab.test.Student;

public class Studenttest {
	public static void main(String[] args) {
		Student s1 = new Student(101, "Sonam", "Singh");

		Student s2 = new Student(102, "anju", "Sinha");

		TreeSet<Student> students = new TreeSet<Student>();

		students.add(s1);
		students.add(s2);

		// Collections.sort(students, new FirstNameSorter());

		System.out.println(students.size());

		for (Student person : students) {
			System.out.println(person.getFname() + " " + person.getLname());
		}

	}

}
