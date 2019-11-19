package com.techlab.casestudy1;

import com.techlab.inheritance.Child;

public class ParentTest {
	public static void main(String[] args) {
		Child c1 = new Child(100);
		System.out.println(c1.getValue());

		Child c2 = new Child(200);
		System.out.println(c2.getValue());

		Child c3 = new Child(500);
		System.out.println(c3.getValue());
	}

}
