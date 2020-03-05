package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra_LoginPage {
	WebDriver driver;
	By profile=By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[1]/span[2]");
	By login=By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[2]/div/div[2]/div[2]/div[2]/div[1]/a[2]");
	By username=By.name("email");
	By password=By.name("password");
	By loginsubmit=By.xpath("//*[@id=\"mountRoot\"]/div/div/div/div/form/fieldset[2]/button");
	
	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver",  "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
	}
	public void LoginPage() //using webdriver get visting the testing website
	{
		driver.get("https://www.myntra.com/");
		System.out.println(driver.getTitle());
	}
	
	public void LoginDeatils() throws IOException, InterruptedException 
	{
	
		WebElement link =driver.findElement(profile); // move to to element achiving by creating object
		WebElement link2=driver.findElement(login);
		Actions action = new Actions(driver);
		action.moveToElement(link);
		action.moveToElement(link2).click().perform();
		driver.findElement(username).sendKeys("sumsuma75@gmail.com"); // passing the vaild mail
		driver.findElement(password).sendKeys("Vinoth007!"); // passing the vaild password
		
		
	}
	public void submit() throws InterruptedException
	{
		driver.findElement(loginsubmit).click(); // loging button
		Thread.sleep(3000);
		driver.close(); // close the current tab
	}

}
