package com.SeleniumProject.javaprogrammes;

public class TwoDimArrayEg {

	public static void main(String[] args)
	{
		Object[][] s=new Object[2][3];
		//Finding the length of the rows
		System.out.println(s.length);
		//Finding the length of the columns
		System.out.println(s[0].length);

		//Writing the data into array
		s[0][1]="Selenium";
		s[1][2]="Sharath";
		
		//reading the from array
		for (int i = 0; i < s.length; i++)
		{
			for (int j = 0; j < s[i].length; j++) 
			{
				System.out.println(s[i][j]);
			}
		}
	}

}
