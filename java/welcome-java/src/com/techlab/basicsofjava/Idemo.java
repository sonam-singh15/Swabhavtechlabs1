package com.techlab.basicsofjava;


interface in1 
{ 
   
    final int a = 10; 
  
    
    void display(); 
} 
  
public class Idemo implements in1 
{ 
  
    public void display() 
    { 
        System.out.println("hello"); 
    } 
  
    public static void main (String[] args) 
    { 
        Idemo t = new Idemo(); 
        t.display(); 
        System.out.println(a); 
    } 
}
 

