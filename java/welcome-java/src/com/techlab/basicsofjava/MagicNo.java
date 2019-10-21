package com.techlab.basicsofjava;
import java.util.Scanner;
public class MagicNo {
	public static void main(String args[])
	{
		System.out.println("enter any no");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		if(no%9==1)
			System.out.println(no+ "is an magic no\n");
		else
			 System.out.println(no+ "is not an magic no\n");
	}

}
