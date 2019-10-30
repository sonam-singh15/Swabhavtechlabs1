package com.techlabs.rectangletest;

import com.techlabs.rectangle.Rectangle;

public class RectangleTest {
	
	public static void main(String [] args)
	{
		Rectangle small= new Rectangle();
		small.setheight(500);
		small.setwidth(700);
		System.out.println("small rectangle details are");
		int h=small.getwidth();
		if(h>100)
	    h=100;
		 System.out.println("you are exceeding the limit value of height will be reset to 100");
		System.out.println("height " +h);
		int w=small.getwidth();
		if(w>100)
			w=100;
	   System.out.println("you are exceeding the limit value of height will be reset to 100");
		System.out.println("width " +w);
		System.out.println("area of small rectangle " +small.calculateArea());
		Rectangle big=new Rectangle();
		big.setheight(20);
		big.setwidth(100);
		System.out.println("big rectangle details are");
		System.out.println("area of big rectangle" +big.calculateArea());
				
		
	}

}
