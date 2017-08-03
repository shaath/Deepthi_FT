package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ValidationEg {

	public static void main(String[] args) 
	{
		String expval="gmail";
		WebDriver driver=new FirefoxDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		
		String actval=driver.getTitle();
		
		if (expval.equalsIgnoreCase(actval)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
			
		}

	}

}
