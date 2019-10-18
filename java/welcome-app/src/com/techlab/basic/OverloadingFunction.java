package com.techlab.basic;

public class OverloadingFunction 
{
	public static void main(String args[]) 
	{
		printInfo("sonam");
		printInfo(10.5);
		printInfo(20);
		printInfo(10.5f);
		

	}
	public static void printInfo(String s) {
		System.out.println("string overloading :" +s);
	}
	public static void printInfo(int a) {
		System.out.println(" Integer overloading :" +a);
	}

	public static void printInfo(float f) {
		System.out.println("float overloading :" +f);
	}
	public static void printInfo(double d) {
		System.out.println("double overloading :" +d);
	}
}

