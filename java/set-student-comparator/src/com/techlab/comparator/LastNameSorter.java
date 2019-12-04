package com.techlab.comparator;

import java.util.Comparator;

public class LastNameSorter implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
		return o1.getLname().compareTo(o2.getLname());
	}

}
