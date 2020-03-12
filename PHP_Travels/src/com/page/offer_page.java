package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class offer_page 
{
	WebDriver driver;


	 public offer_page(WebDriver driver) 
	 {
		 this.driver=driver;
	 }
		public void  currency() throws InterruptedException 
		{
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/section/div/form/button")).click();
			driver.findElement(By.id("dropdownCurrency")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"header-waypoint-sticky\"]/div[1]/div/div/div[2]/div/ul/li[1]/div/div/div/a[1]")).click();
			Thread.sleep(2000);
		}
		
		public String trip() throws InterruptedException 
		{
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[3]/section/div/div[2]/div/div/div/div/div/div/div/div[2]/div/div[2]/a")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[1]/div[1]/section/div/div/div[2]/div/div/div[7]/div/div[2]/div/div[3]/div/div/a")).click();
			driver.findElement(By.name("name")).sendKeys("sanjeev");
			driver.findElement(By.name("phone")).sendKeys("9003510773");
			driver.findElement(By.name("message")).sendKeys("Tour");
			driver.findElement(By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div/div[6]/input[3]")).click();
			String a=driver.findElement(By.xpath("//*[@id=\"OVERVIEW\"]/section/div/div/div/div/div/article/div[3]/form/fieldset/div[1]")).getText();
			System.out.println(a);
			
			return a;
		}
}
