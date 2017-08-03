package com.SeleniumProject.javaprogrammes;

public class ObjectEg {

	public static void main(String[] args)
	{
		Object[] salary={"Selenium",499999,444.444,'M',true};
		
		//finding the length of the array
				System.out.println(salary.length);
				//Reading the data from an array
				
//				System.out.println(salary[2]);
				
//				for (int i = 0; i < salary.length; i++)
//				{
//					System.out.println(salary[i]);
//				}

				for (Object Deepthi : salary)
				{
					System.out.println(Deepthi);
				}

	}

}
