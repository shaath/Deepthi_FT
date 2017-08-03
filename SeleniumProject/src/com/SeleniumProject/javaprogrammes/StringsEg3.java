package com.SeleniumProject.javaprogrammes;

public class StringsEg3 {

	public static void main(String[] args)
	{
		String var1="Welcome to Admin";
		String var2="Admin";
		
		if (var1.contains(var2))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}

	}

}
