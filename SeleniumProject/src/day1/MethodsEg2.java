package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class MethodsEg2 {

	public static void main(String[] args)
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://google.com");
		driver.manage().window().maximize();
		Sleeper.sleepTightInSeconds(3);
		//Navigating to bing.com
		driver.navigate().to("http://bing.com");
		Sleeper.sleepTightInSeconds(3);
		//Navigating back to google
		driver.navigate().back();
		Sleeper.sleepTightInSeconds(3);
		//Navigating forward to bing
		driver.navigate().forward();
		Sleeper.sleepTightInSeconds(3);
		//Refreshing the page
		driver.navigate().refresh();

	}

}
