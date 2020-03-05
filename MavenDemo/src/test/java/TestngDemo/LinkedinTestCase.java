package TestngDemo;


import org.testng.annotations.Test;

import org.testng.annotations.BeforeMethod;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;


public class LinkedinTestCase
{
	
WebDriver driver;
  
@Test(alwaysRun=true)
  
public void Signin() 
  
{
	 
		driver.findElement(By.className("nav__button-secondary")).click(); //signin

		driver.findElement(By.id("username")).sendKeys("raginiboobalan@gmail.com"); //username
	
		driver.findElement(By.id("password")).sendKeys("1234567");  //passwrd
	
		driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click();  //login
		
		driver.findElement(By.xpath("//*[@id=\"jobs-tab-icon\"]")).click(); //jobs
		
  
}
 
 
 @BeforeMethod(description="Launching the App")
  
public void beforeMethod() 
 
 {
	  	
	 	System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");

		driver=new ChromeDriver();
		
		driver.get("https://www.linkedin.com/");
		
		driver.manage().window().maximize();	
 
 }

  
@AfterMethod(description="Closing the App")
  
public void afterMethod() 
  
{
	  
		driver.close();
 
 }


}
