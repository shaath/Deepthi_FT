package com.SeleniumProject.javaprogrammes;

public class ReverseStringEg {

	public static void main(String[] args) 
	{
		String course="malayalam";
		String rev="";
		int len=course.length();
		for (int i = len-1; i >=0; i--) 
		{
//			System.out.print(course.charAt(i));
			rev=rev+course.charAt(i);
		}
		System.out.println(rev);
		if (course.equalsIgnoreCase(rev))
		{
			System.out.println("Given String is polindrome");
		}
		else
		{
			System.out.println("Given String is not a polindrome");
		}
	}

}
