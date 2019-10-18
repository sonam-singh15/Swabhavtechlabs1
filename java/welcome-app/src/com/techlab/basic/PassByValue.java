package com.techlab.basic;

public class PassByValue {
	public static void main(String args[]) {
	
	        int marks= 100; 
	        mutateMarksToZero(marks); 
	        System.out.println("Marks is:" +marks); 
	        int[] marks1= {10,20,30,40};
	        mutateMarksToZero(marks1); 
	        for (int m : marks1) {
	        	System.out.println("marks of array are" +m);
				
			}
	        
	    } 
	    public static void mutateMarksToZero(int marks) 
	    { 
	        marks=0;
	    } 
	    public static void mutateMarksToZero(int []marks1) 
	    { 
	       for (int i=0;i<4;i++)
	       {
	    	   marks1[i]=0;
	       }
	    } 
	    
	}


