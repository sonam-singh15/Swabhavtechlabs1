package com.techlab.basic;

public class QueryString1 {
	public static void main(String args[]) {
		
		        String s="https//www.Swabhavtechlab.com?developer=SonamSingh";
		        String[] s1=s.split("=");
		       String[] s2=s.split("[? .]");
		        int length1=s2.length ;
		        System .out.println (length1);
		        int length2=s1.length ;
		        System .out.println (length2 );
		       System .out.println ("company name is :-" +s2[1]);
		        System .out.println ("Emp name is :-" +s1[1]);
		    }
		}

