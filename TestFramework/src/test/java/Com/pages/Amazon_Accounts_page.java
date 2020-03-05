package Com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Accounts_page {
WebDriver driver;

public Amazon_Accounts_page(WebDriver driver)
{
	this.driver=driver;
}
public void move()
{
	WebElement a=driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span[2]"));
	WebElement b=driver.findElement(By.xpath("//*[@id=\"nav-al-your-account\"]/a[1]/span"));
	Actions d=new Actions(driver);
	d.moveToElement(a);
	d.moveToElement(b).click().build().perform();
}
}
