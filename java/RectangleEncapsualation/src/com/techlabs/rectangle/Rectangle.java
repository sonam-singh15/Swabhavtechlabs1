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
		height=newheight;
	}
	public int getwidth()
	{
		return width;
	}
	public void setwidth(int newwidth)
	{
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
