package com.techlab.inheritance.test;

import com.techlabs.inheritance.Boy;
import com.techlabs.inheritance.Infant;
import com.techlabs.inheritance.Kid;
import com.techlabs.inheritance.Man;

public class ManTest {
	public static void main(String[] args) {
		// caseStudy 1
		Man x;
		x = new Man();
		System.out.println("Man class info:- \n");

		caseStudy1(x);

		// case study2
		Boy y;
		y = new Boy();
		System.out.println("\n Boy info :- \n");
		caseStudy2(y);

		// casestudy3
		Man x1;
		x1 = new Boy();
		caseStudy3(x1);
		System.out.println(" ");
		// x.eat(); //getting error

		// casestudy4
		Kid z;
		z = new Kid();
		caseStudy4(z);

		Object x2;
		x2 = 10;
		System.out.println(x2);

		System.out.println(" ");

		walkInGarden(new Man());
		walkInGarden(new Boy());
		walkInGarden(new Kid());
		walkInGarden(new Infant());

	}

	public static void walkInGarden(Man m) {
		System.out.println("Walking in garden");
		m.play();

	}

	public static void caseStudy1(Man x) {
		x.play();
		x.read();
	}

	public static void caseStudy2(Boy y) {
		y.play(); // boy's play
		y.eat();
		y.read();
	}

	public static void caseStudy3(Man x1) {
		x1.play();
		x1.read();
	}

	public static void caseStudy4(Kid z) {
		z.play();
	}

}
