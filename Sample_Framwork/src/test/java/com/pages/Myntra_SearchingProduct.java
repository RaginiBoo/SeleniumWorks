package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra_SearchingProduct {
WebDriver driver;
	
	By search_box=By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input");

	public void launch() // lauching the application
	{
		System.setProperty("webdriver.chrome.driver",  "src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	}
	
	public void search_page()// visiting searching product page
	{
		driver.get("https://www.myntra.com/?gclid=EAIaIQobChMIqdWnzPr_5wIVz46PCh1vRwtYEAAYASAAEgIv9vD_BwE&utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=myntra&utm_content=&matchtype=e");
	}
	
	public void search_product() // searching the product
	{
		driver.findElement(search_box).sendKeys("watches");
		driver.findElement(search_box).sendKeys(Keys.ENTER);
		
		//driver.get("https://www.myntra.com/?gclid=EAIaIQobChMIqdWnzPr_5wIVz46PCh1vRwtYEAAYASAAEgIv9vD_BwE&utm_source=google&utm_medium=cpc&utm_campaign=&utm_term=myntra&utm_content=&matchtype=e");
		
		driver.findElement(search_box).sendKeys("bags");
		driver.findElement(search_box).sendKeys(Keys.ENTER);
	}
	
	public void close_search() // closing the current tab
	{
		driver.close();
	}


}
