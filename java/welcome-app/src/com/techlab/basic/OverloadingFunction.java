package com.techlab.basic;

public class OverloadingFunction 
{
	public static void main(String args[]) 
	{
		OverloadingFunction o1=new OverloadingFunction();
		o1.printInfo(12.4);
		//printInfo("sonam");
		//printInfo(10.5);
		printInfo(20);
		printInfo(10.5f);
	}
	 static void printInfo(String s) {
		System.out.println("string overloading :" +s);
	}
	 static void printInfo(int a) {
		System.out.println(" Integer overloading :" +a);
	}

	 static void printInfo(float f) {
		System.out.println("float overloading :" +f);
	}
	 static void printInfo(double d) {
		System.out.println("double overloading :" +d);
	}
}

