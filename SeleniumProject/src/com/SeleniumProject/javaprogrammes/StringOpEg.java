package com.SeleniumProject.javaprogrammes;

public class StringOpEg {

	public static void main(String[] args)
	{
		String course=" Selenium  ";
		//Finding the length of the string
		System.out.println(course.length());
		
		System.out.println(course.charAt(1));
		
		System.out.println(course.substring(2, 5));
		
		System.out.println(course.toUpperCase());
		
		System.out.println(course.toLowerCase());

		System.out.println(course.replace('e', 'd'));
		
		System.out.println(course.trim());
		
		System.out.println("You are selected "+course);
		
		System.out.println(course.join(" ", "You are selected",course));
	}

}
