package com.SeleniumProject.javaprogrammes;

import java.util.ArrayList;

public class ArraylistEg {

	public static void main(String[] args)
	{
		ArrayList<Object> x=new ArrayList<Object>();
		
		//Writing the data into arraylist
		
		x.add("Deepthi");
		x.add("Selenium");
		x.add(40000);
		x.add("Apple");
		x.add(444.44);
		x.add(1, "Sharath");
		
		//Finding the size of the arraylist
		System.out.println(x.size());
		
		//Reading the data from arraylist
		for (int i = 0; i < x.size(); i++) 
		{
			System.out.println(x.get(i));
		}

	}

}
