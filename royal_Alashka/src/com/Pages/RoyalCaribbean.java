package com.Pages;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class RoyalCaribbean {
	WebDriver driver;
	
	By whalewatching=By.partialLinkText("whale watching tour");
	By menu =By.className("headerMainToolbar__menuButtonImage");
	By Cruise=By.linkText("Plan A Cruise");
	By close =By.className("headerSidenav__buttonImage");
	By ships= By.linkText("SHIPS");
	By rhapsoday=By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div");
	By deck =By.linkText("DECK PLANS");
	By dropdown= By.id("deckDropdown");
	By royal=By.xpath("//*[@id=\"deck-plans-template\"]/section/section[2]/section[1]/div[2]/section[5]/h4");
	
	public RoyalCaribbean(WebDriver driver)
	{
		this.driver=driver;
	}
	public int checklink()
	{
		List<WebElement> link = driver.findElements(whalewatching);
		int a=link.size();
			System.out.println("Checking whale link Persent 	:"+link.size());
			return a;
		}
	 
	public void PlanCruise() throws InterruptedException
	{
		driver.findElement(menu).click();
		driver.findElement(Cruise).click();
		driver.findElement(close).click();
		driver.findElement(ships).click();
		Thread.sleep(2000);
		driver.findElement(rhapsoday).click();
		//Thread.sleep(2000);
		driver.findElement(deck).click();
		Thread.sleep(3000);
		Select se = new Select(driver.findElement(dropdown));
		se.selectByValue("BR");
		Thread.sleep(3000);
	}
	public String royal() {	
		String ro=driver.findElement(royal).getText();
		String roy=ro.substring(0,12);
		 System.out.println("Checking Presence of Royal Suite 	:"+roy);	
		return	roy; 
	
	}
}
