package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_ProfileDetails {
	WebDriver driver;
	By profile=By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[2]");
	By profileid=By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[1]/a/div[2]");
	By username=By.name("email");
	By password=By.name("password");
	By loginsubmit=By.xpath("//*[@id=\"mountRoot\"]/div/div/div/div/form/fieldset[2]/button");
	By column =By.xpath("//*[@id=\"mountRoot\"]/div/div/div[3]/div/table/tbody/tr[1]/td[2]");
	public void url() { // launhing the chrome
		System.setProperty("webdriver.chrome.driver", "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void LoginPage() // login the myntra page
	{
		driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/shop/men");
		System.out.println(driver.getTitle());
		driver.findElement(username).sendKeys("sumsuma75@gmail.com");
		driver.findElement(password).sendKeys("Vinoth007!");
		driver.findElement(loginsubmit).click();
	}
	public void profiledetails() // getting the profile details and printing the mail id
	{
		
		WebElement link =driver.findElement(profile);
		WebElement link2=driver.findElement(profileid);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		
		
	}
	

}
