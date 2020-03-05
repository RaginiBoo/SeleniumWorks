package cucumber;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class TestCase {

	WebDriver driver;
	@Test
	public void launch_browser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
	driver=new ChromeDriver();
			driver.get("https://www.google.co.in");
	WebElement txtbox=driver.findElement(By.name("q"));
	if(txtbox.isEnabled())
	{
	txtbox.sendKeys("Hello Welcome");
	System.out.println("The page displays Google Search Button");
	driver.close();
	}
	
	}
	
	}