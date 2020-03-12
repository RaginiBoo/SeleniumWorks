package com.BaseClass;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class checking {

public static void main(String args[]) throws InterruptedException
{
	
	By whalewatching=By.linkText("whale watching tour");
	By menu =By.className("headerMainToolbar__menuButtonImage");
	By Cruise=By.linkText("Plan A Cruise");
	System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize(); 
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.royalcaribbean.com/alaska-cruises");
	List<WebElement> link = driver.findElements(whalewatching);
	System.out.println("Checking whale link Persent 	:"+link.size());
	driver.findElement(menu).click();
	driver.findElement(Cruise).click();
	driver.findElement(By.className("headerSidenav__buttonImage")).click();
	driver.findElement(By.linkText("SHIPS")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div/div[6]/div/section/div/div[16]/a/div")).click();
	driver.findElement(By.linkText("DECK PLANS")).click();
	Thread.sleep(4000);
	Select se = new Select(driver.findElement(By.id("deckDropdown")));
	se.selectByValue("BR");
	String rayol=driver.findElement(By.xpath("//*[@id=\"deck-plans-template\"]/section/section[2]/section[1]/div[2]/section[5]/h4")).getText();
	String roy=rayol.substring(0,12);
	System.out.println("Checking Presence of Royal Suite	: "+roy);
	
	
	
//	WebElement deckDropDown =driver.findElement(By.className("deck-dropdown"));
//	
//	int deckNo = 0;
//	Select deck = new Select(deckDropDown);
//	Actions action = new Actions(driver);
//	for (int i = 0; i <= deckNo - 3; i++) {
//		deckDropDown.click();
//		action.sendKeys(Keys.ARROW_DOWN).build().perform();
	}
		
	
	
}

