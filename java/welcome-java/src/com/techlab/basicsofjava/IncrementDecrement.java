package com.techlab.basicsofjava;
public class IncrementDecrement {
	public static void main(String args[]) {
		String s="welcome to swabhavtech labs";
		int count=1;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}

		}
		System.out.println("no of words are:" +count);

	}

}
