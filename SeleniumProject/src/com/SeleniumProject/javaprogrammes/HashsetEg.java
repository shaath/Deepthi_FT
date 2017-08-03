package com.SeleniumProject.javaprogrammes;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashsetEg {

	public static void main(String[] args)
	{
		Set<Object> s=new HashSet<Object>();
		
		//Writing the data into hashset
		s.add("Sharath");
		s.add("Chandra");
		s.add("Apple");
		s.add(440000);
		s.add("Boll");
		s.add("Apple");
		
		//Reading the data from hashset
		Iterator<Object> it=s.iterator();
		
		while(it.hasNext())
		{
			Object data=it.next();
			System.out.println(data);
		}

	}

}
