package com.techlab.basic;

public class MethodExample {
	public static void main(String args[]) {
		MethodExample m = new MethodExample();
		m.Add(10, 12);

	}

	public void Add(int x, int y) {
		int z;
		z = x + y;
		System.out.println("Addition is:" + z);
	}

}
