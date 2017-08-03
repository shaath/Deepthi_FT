package day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

public class AutofillersEg {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		driver.manage().window().maximize();

		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("books");
		Sleeper.sleepTightInSeconds(3);
		
		List<WebElement> auto=driver.findElements(By.xpath(".//*[@id='nav-flyout-searchAjax']/div/div/div"));
		System.out.println(auto.size());
		
		for (int i = 0; i < auto.size(); i++)
		{
			String text=auto.get(i).getText();
			System.out.println(text);
			if (text.contains("teens")) 
			{
				auto.get(i).click();
				break;
			}
		}
	}

}
