package com.techalab.test;

import java.util.Comparator;

public class LastNameSorter implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getLname().compareTo(o2.getLname());
	}

}
