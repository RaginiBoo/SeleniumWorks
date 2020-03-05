import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumberReport {
	 WebDriver driver = null; 
		
	   @Given("^I have opened the browser$") 
	   public void openBrowser() { 
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
			driver=new ChromeDriver();
	   } 
		
	   @When("^I open Facebook website$") 
	   public void goToFacebook() { 
	      driver.navigate().to("https://www.linkdein.com/"); 
	   } 
		
	   @Then("^Login button should exits$") 
	   public void loginButton() { 
	      if(driver.findElement(By.id("u_0_v")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else { 
	         System.out.println("Test 1 Fail");
	      }
	   } 
		
	   @Then("^Forgot password link should exist$") 
	   public void forgotPWD() { 
	      if(driver.findElement(By.id("")).isEnabled()) { 
	         System.out.println("Test 1 Pass"); 
	      } else {
	         System.out.println("Test 1 Fail");
	      } 
	   }}
