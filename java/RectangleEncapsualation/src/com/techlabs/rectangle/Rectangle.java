package com.techlabs.rectangle;

public class Rectangle {
	
	private int height;
	private int width;
	
	public int getHeight()
	{
		
		return height;
	}
	public void setheight(int newheight)
	{
		if(newheight>100)
		{
	      newheight=100;
	 System.out.println("you are exceeding the limit value of height will be reset to 100");
		}
		height=newheight;
	}
	public int getwidth()
	{
		return width;
	}
	public void setwidth(int newwidth)
	{
		if(newwidth>100)
		{
			newwidth=100;
	   System.out.println("you are exceeding the limit value of width will be reset to 100");
		}
		width=newwidth;
	}
	
	public int calculateArea()
	{
		int area;
		 height=height>100?100:height;
		 width=width>100?100:width;
		area=height*width;
		return area;
	}

}
