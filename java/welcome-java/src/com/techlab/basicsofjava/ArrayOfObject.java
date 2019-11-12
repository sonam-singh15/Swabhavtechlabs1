package com.techlab.basicsofjava;

public class ArrayOfObject {
	public static void main(String args[]) {

		Object[] thisIsAObjectArray = { "Java Code", new Integer(4) };
		System.out.println(thisIsAObjectArray[0]);
		System.out.println(thisIsAObjectArray[1]);

		// step1 : first create array of 10 elements that holds object addresses.
		Emp[] employees = new Emp[10];
		// step2 : now create objects in a loop.
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Emp(i + 1);// this will call constructor.
		}
	}
}

class Emp {
	int eno;

	public Emp(int no) {
		eno = no;
		System.out.println("emp constructor called..eno is.." + eno);
	}
}
