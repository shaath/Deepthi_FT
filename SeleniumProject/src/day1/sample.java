package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class sample {

	public static void main(String[] args)
	{

		System.setProperty("webdriver.chrome.driver", "F:\\Cdownloads/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
//		WebDriver driver=new FirefoxDriver();
		driver.get("http://orangehrm.qedgetech.com");
//		driver.manage().window().maximize(); 

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Employee List")).click();
		
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.xpath("//*[@id='empsearch_employee_name_empName']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='empsearch_employee_name_empName']")).sendKeys("deepthi");

	}

}
