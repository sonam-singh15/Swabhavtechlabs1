
package com.techlab.basicsofjava;
import java.util.Scanner;

public class ScannerExample {
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		int var=sc.nextInt();
		System.out.println("entered no is");
		System.out.print(var);
		float fvar=sc.nextFloat();
		System.out.println("enterd float no is ");
		System.out.print(fvar);
		String svar=sc.next();
		System.out.println("entered string is ");
		System.out.print(svar);
		
		
		
	}

}
