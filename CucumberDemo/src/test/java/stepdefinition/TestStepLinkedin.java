package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestStepLinkedin 
{
WebDriver driver;
	
	@Given("^I launch Linkedin browser$")
	public void launchbrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();  
	Thread.sleep(1000);
	}
	
	@When("^I open Linkedin Homepage$")
	public void LinkedinApp() throws InterruptedException
	{
	driver.get("https://www.linkedin.com/");
	Thread.sleep(1000);
	}
	
	@Then("^Click Signin homepage button$")
	public void Signin() throws InterruptedException 
	{  
		driver.findElement(By.className("nav__button-secondary")).click();
		Thread.sleep(1000);
	}
	
	@Then("^Enter the Email id or PhoneNumber$")
	public void Emailid() throws InterruptedException 
	{  
		driver.findElement(By.id("username")).sendKeys("raginiboobalan@gmail.com");
		Thread.sleep(1000);
	}
	
	@Then("^Enter the Password$")
	public void Password() throws InterruptedException 
	{  
		driver.findElement(By.id("password")).sendKeys("12345");
		Thread.sleep(1000);
	}
	
	@And("^Click the Sign in  button$")
	public void SigninButton()  
	{
		driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();
		driver.close();
	
	}
}
