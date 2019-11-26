package com.techlab.exception;

public class ExceptionTest1 {
	public static void main(String[] args) throws Exception {
		try {
			m1();
			System.out.println("End of program");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of program");

	}

	static void m1() throws Exception {
		System.out.println("M1 is called");
		m2();
	}

	static void m2() throws Exception {
		System.out.println("M2 is called");
		m3();
	}

	static void m3() throws Exception {
		System.out.println("M3 is called");
		throw new Exception("There is some problem");
	}

}
