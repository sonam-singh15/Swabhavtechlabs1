package com.techlab.comparatot.test;

import java.util.TreeSet;
import com.techalab.test.FirstNameSorter;
import com.techalab.test.Student3;

public class Studenttest3 {
	public static void main(String[] args) {
		Student3 s1 = new Student3(101, "Sonam", "Singh");

		Student3 s2 = new Student3(102, "anju", "Sinha");

		TreeSet<Student3> students = new TreeSet<Student3>();

		students.add(s1);
		students.add(s2);

		// Collections.sort(students, new FirstNameSorter());

		System.out.println(students.size());

		for (Student3 person : students) {
			System.out.println(person.getFname() + " " + person.getLname());
		}

	}
}
