package day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class GmailLoginEg {

	public static void main(String[] args)
	{
		//Launching the firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		//Launching gmail app
		driver.get("http://gmail.com");
		//Maximizing the window
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//Identifying the email 
		WebElement email=driver.findElement(By.id("identifierId"));
		//Send the email id into email textbox
		
		email.sendKeys("testingtoolstrainer449@gmail.com");
		
//		email.clear();
		
//		email.click();
		
		//Clicking on Next
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		
//		Sleeper.sleepTightInSeconds(10);
		
		//Entering the password in password field
		driver.findElement(By.name("password")).sendKeys("123456789");
		//Clicking on next
		driver.findElement(By.cssSelector(".RveJvd.snByac")).click();
	}

}
