package com.techlab.basicsofjava;

public class ArrayOfObject {
	public int power;
	public int Serial_no;

	public ArrayOfObject(int p, int s) {
		power = p;
		Serial_no = s;
	}
}

class Ar1 {
	public static void main(String[] args) {
		ArrayOfObject[] c;
		c = new ArrayOfObject[10];
		c[0] = new ArrayOfObject(800, 111);
	}
}
