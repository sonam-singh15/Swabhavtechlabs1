package com.techlab.case1;

public class Foo {
	@RequireRefacatoring
	public void m1() {
		System.out.println("This is method1");
	}

	@RequireRefacatoring
	public void m2() {
		System.out.println("This is method2");
	}

	public void m3() {
		System.out.println("This is method3");
	}

}
