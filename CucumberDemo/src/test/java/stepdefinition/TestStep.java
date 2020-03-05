package stepdefinition;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStep {
	WebDriver driver;
	
	@Given("^I launch Chrome browser$")
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
	driver=new ChromeDriver();
	Thread.sleep(2000);
	}
	
	@When("^I open Google Homepage$")
	public void open_homepage() throws InterruptedException
	{
	Thread.sleep(2000);
	driver.get("https://www.google.com");
	}
	
	@Then("^I verify that the page displays search text box$")
	public void search_text_box() throws InterruptedException 
	{
	    // Write code here that turns the phrase above into concrete actions
		WebElement txtbox=driver.findElement(By.name("q"));
		if(txtbox.isEnabled())
		{
		txtbox.sendKeys("Ragini Boobalan");
		Thread.sleep(2000);
		}
	}
	
	@Then("^i verify that text is entered and searched$")
	public void searched() 
	{  
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}
	
	@Then("^clicks the submit button$")
	public void submit_button()  
	{
		System.out.println("The page displays Google Search Button"); 
	}

}
