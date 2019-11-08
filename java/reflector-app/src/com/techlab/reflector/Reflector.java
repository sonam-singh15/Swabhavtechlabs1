package com.techlab.reflector;

public class Reflector {

	private String s;

	public Reflector() {
		s = "swabhavtechlabs";
	}
	public String getName(String s)
	{
		return s;
	}

	public void setName(String s)
	{
		this.s=s;
	}

	public String getString() {
		return s;
	}

	public void method1() {
		System.out.println("The string is " + s);
	}

	public void method2(int n) {
		System.out.println("The number is " + n);
	}
}
