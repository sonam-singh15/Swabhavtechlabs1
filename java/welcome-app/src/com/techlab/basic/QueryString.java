package com.techlab.basic;

public class QueryString {
	public static void main(String args[]) {
		String url = "https://www.google.com?developer=mitali";
		int start,start1,end,end1;
		 start = url.indexOf("//") + 6;
		 start1 = url.indexOf("//") + 16;
		 end = url.indexOf("?") + 11;
		 end1 = url.indexOf("?") + 17;
		System.out.println(url.substring(start, start1));
		 System.out.println(url.substring(end, end1));

	}

}
