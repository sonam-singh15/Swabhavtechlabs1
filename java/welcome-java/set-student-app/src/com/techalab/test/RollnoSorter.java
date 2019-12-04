package com.techalab.test;

import java.util.Comparator;

public class RollnoSorter implements Comparator<Student3> {

	@Override
	public int compare(Student3 o1, Student3 o2) {
		return o1.getRollno() - o2.getRollno();
	}

}
