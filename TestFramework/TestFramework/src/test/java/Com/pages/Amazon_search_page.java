package Com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

//Searching products in amazon website
public class Amazon_search_page {
	WebDriver driver;
	By search=By.xpath("//*[@id=\"twotabsearchtextbox\"]");
	

	public Amazon_search_page(WebDriver driver)
	{
		this.driver=driver;
	}
//using the keyboard operations to select the product in the list
	public void movedown(String values) throws InterruptedException
	{
		driver.findElement(search).sendKeys(values);
		Actions d=new Actions(driver);
		Thread.sleep(1000); //waiting time
		d.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		d.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		d.sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(1000);
		d.sendKeys(Keys.ENTER).build().perform();
	}
}
