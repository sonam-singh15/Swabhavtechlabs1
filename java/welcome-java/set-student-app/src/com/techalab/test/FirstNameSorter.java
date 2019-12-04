package com.techalab.test;

import java.util.Comparator;

public class FirstNameSorter implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
		return o1.getFname().compareTo(o2.getFname());
	}

}
