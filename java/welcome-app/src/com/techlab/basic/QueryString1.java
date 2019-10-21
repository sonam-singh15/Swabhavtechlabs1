package com.techlab.basic;

public class QueryString1 {
	public static void main(String args[]) {
		String str = "www.swabhavtechlab.com@developer=sonam";
		// String[] arrofstr1=str.split("="); // correct op
		String[] arrofstr1 = str.split("[ . =  @]");
		int length=arrofstr1.length;
		System.out.println("len is:" +length);
		for (String a : arrofstr1) {
			System.out.println(a);
		}
		

		
	}

}
