package com.techlab.basicsofjava;

public class QueryString {
	public static void main(String[] args) {

		java.lang.String s = "https//www.google.com?developer=SonamSingh";
		String[] s1 = s.split("=");
		String[] s2 = s.split("[? .]");
		 int length1=s2.length ;
		 System .out.println (length1);
		 int length2=s1.length ;
		 System .out.println (length2 );
		System.out.println("company name is :-" + s2[1]);
		System.out.println("Emp name is :-" + s1[1]);
	}

}
