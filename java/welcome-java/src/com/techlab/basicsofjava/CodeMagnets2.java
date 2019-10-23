package com.techlab.basicsofjava;

public class CodeMagnets2 {
	public static void main(String [] args)
	{
		drumkit d=new drumkit();
		d.snare=false;
		d.playSnare();
		d.playTopHot();
		if(d.snare==true)
		{
			d.playSnare();
		}
		
	}
	
}
class drumkit
{
	boolean topat=true;
	boolean snare=true;
	public static void playTopHot()
	{
		System.out.println("DING DING DE-DING");
	}
	public static void playSnare()
	{
		System.out.println("bang bang ba bang");
	}

}
