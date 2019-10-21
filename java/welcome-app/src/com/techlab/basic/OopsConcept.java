package com.techlab.basic;

public class OopsConcept {
	public static void main(String args[]) {
		
		int sum=addTwoNo(8, 9);
	     OopsConcept o1=new OopsConcept();
	     double d;
	     d=o1.addTwoNo1(12.4, 14.7);
	     
		System.out.println("addition is :" +sum);
		System.out.println("addition is :" +d);
	}

 public static int addTwoNo(int a,int b)
{
	int c;
	c=a+b;
	return c;
}

public static double addTwoNo1(double a,double b)
{
	double d;
	d=(double)(a+b);
	return d;
}
}