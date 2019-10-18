package com.techlab.basic;

public class QueryString1 {
	public static void main(String args[]) {
		String str = "https://www.swabhavtechlab.com@developer=sonam";
		
		//String[] arrofstr=str.split("s",7);
		String[] arrofstr1=str.split("@");
		//String[] arrofstr1=str.split("https://");
		for(String a:arrofstr1)
		{
		System.out.println(a);
		}
		
		
	}

}
