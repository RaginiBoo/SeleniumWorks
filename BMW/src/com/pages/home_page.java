package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class home_page {

	WebDriver driver;

	By model=By.linkText("Models");
    By tab7=By.linkText("7");
	By image=By.xpath("//img[@alt='Not found']");
    By techdata=By.linkText("Technical Data");
    By speed=By.xpath("//*[@id=\"top-of-content\"]/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[2]/div");



public home_page(WebDriver driver)
{
	this.driver=driver;
}


public void bmw_method() throws InterruptedException
{  
	
	driver.findElement(model).click();                        
	driver.findElement(tab7).click();                        
	Thread.sleep(3000);
	
	WebElement a=driver.findElement(image);                 
	
	Thread.sleep(3000);
	
	Actions act=new Actions(driver);
	act.moveToElement(a);                                   
	Thread.sleep(4000);  
	act.click(a).build().perform();                       
	
	
	
	}

public String topspeed() throws InterruptedException

{
	driver.findElement(techdata).click();               
	Thread.sleep(3000);
	String s=driver.findElement(speed).getText();       
	return s;

}






}
