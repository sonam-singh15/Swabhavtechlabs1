package com.techlab.basic;

public class OopsConcept extends oopsconcept {
	
	public static void main(String args[]) {
	    
		oopsconcept o=new oopsconcept();
		o.a=40;
		o.b=17;
		o.Add(40, 32);
		System.out.println("addition is :" +o.a);
		System.out.println("addition is :" +o.b);
		
	}
}
class oopsconcept {
	 int a=10,b=20;
	 int c=a+b;
	 
	 void Add(int a,int b)
	 {
		 c=a+b;
		 System.out.println("sum is" +c);
	 }
	
}
 