package day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AlertsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://automationminds.com/selenium-practice-pages/handling-alerts-using-selenium/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("html/body/div[1]/div[2]/div/div/div/div/main/p[7]/button")).click();
		
		Sleeper.sleepTightInSeconds(3);
		
		Alert alt=driver.switchTo().alert();
		alt.sendKeys("Yes");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptOption")).getText());

		
	}

}
