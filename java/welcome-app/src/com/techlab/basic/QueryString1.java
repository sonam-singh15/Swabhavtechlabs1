package com.techlab.basic;

public class QueryString1 {
	public static void main(String args[]) {
		String str = "https://www.swabhavtechlab.com@developer=sonam";
		
		//String[] arrofstr=str.split("s",7);
	    //String[] arrofstr1=str.split("="); // correct op
		String[] arrofstr1=str.split(".com@developer=");

		//String[] arrofstr1=str.split("[, @ // :]+");
		
		for(String a:arrofstr1)
		{
		System.out.println(a);
		}
		
	   /* String s1 = "";
	    String[] s2 = str.split(".com@developer=");

	    for ( int i = 0; i < s2.length; i++)
	    {
	        s1 = s1 + s2[i];
	    }
	    System.out.println(s1);*/
		
		
	}

}
