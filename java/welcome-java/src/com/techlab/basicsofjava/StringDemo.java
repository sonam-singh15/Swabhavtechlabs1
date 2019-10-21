package com.techlab.basicsofjava;

public class StringDemo {
	public static void main(String args[])
	{
		String s1 = "sonam";
        String s2 = "singh";
        System.out.println("String 1: " + s1);
        System.out.println("String 2: " + s2);

        
        int S = s1.compareTo(s2);

      
        if (S < 0) { System.out.println("\"" + s1 + "\"" + " is lexicographically higher than " + "\"" + s2 + "\"");
        } else if (S == 0) {
            System.out.println("\"" + s1 + "\"" + " is lexicographically  equal to " + "\"" + s2 + "\"");
        } else if (S > 0) {
            System.out.println("\"" + s1 + "\"" + " is lexicographically less than " + "\"" + s2 + "\"");
        }

	}
}
