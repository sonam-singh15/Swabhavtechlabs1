package com.techlab.basic;

public class QueryString {
	public static void main(String args[]) {
		String url = "https://www.swabhavtechlab.com?developer=sonam";
		int start,start1,end,end1;
		 //len = url.length();
		 start = url.indexOf("//") + 6;
		 start1 = url.indexOf("//") + 17;
		 end = url.indexOf("?") + 10;
		 end1 = url.indexOf("?") + 16;
		System.out.println(url.substring(start, start1));
		 System.out.println(url.substring(end, end1));

	}

}
