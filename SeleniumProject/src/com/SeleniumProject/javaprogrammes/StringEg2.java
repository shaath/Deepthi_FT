package com.SeleniumProject.javaprogrammes;

public class StringEg2 {

	public static void main(String[] args) 
	{
		String var1="Selenium";
		String var2="selenium";
		
		if (var1.equalsIgnoreCase(var2)) 
		{
			System.out.println("Both the strings are same");
		}
		else
		{
			System.out.println("Both the strings are not same");
		}

	}

}
