package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.server.browserlaunchers.Sleeper;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login_LogoutTest
{
	public static WebDriver driver;
	@Given("^Browser Launched and navigated to url$")
	public void browser_Launched_and_navigated_to_url() throws Throwable 
	{
	    driver=new FirefoxDriver();
	    driver.get("http://opensource.demo.orangehrmlive.com");
	}

	@When("^User enters username and password$")
	public void user_enters_username_and_password() throws Throwable
	{
	    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	    driver.findElement(By.id("txtPassword")).sendKeys("admin");
	}

	@When("^clicks on login$")
	public void clicks_on_login() throws Throwable
	{
	    driver.findElement(By.id("btnLogin")).click();
	}

	@Then("^welcome admin message displyed$")
	public void welcome_admin_message_displyed() throws Throwable 
	{
	    String expval="Welcome Admin";
	    String actval=driver.findElement(By.partialLinkText("Welcome")).getText();
	    Assert.assertEquals(expval, actval);
	}

	@When("^Tester clicks on welcome admin$")
	public void tester_clicks_on_welcome_admin() throws Throwable 
	{
		Sleeper.sleepTightInSeconds(3);
		driver.findElement(By.partialLinkText("Welcome")).click();
	}

	@When("^also clicks on logout$")
	public void also_clicks_on_logout() throws Throwable
	{
	    driver.findElement(By.linkText("Logout")).click();
	}

	@Then("^Login page displayed$")
	public void login_page_displayed() throws Throwable 
	{
	    String expval="LOGIN";
	    String actval=driver.findElement(By.id("btnLogin")).getAttribute("value");
	    Assert.assertEquals(expval, actval);
	}


}
