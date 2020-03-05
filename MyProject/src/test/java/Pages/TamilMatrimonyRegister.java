package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TamilMatrimonyRegister 
{
	WebDriver driver;
	By profilefor= By.id("dd").linkText("Friend").linkText("Female");
	By name= By.id("NAME");
	By number= By.className("regisplacehold");
	By register= By.xpath("//*[@id=\"poppinsfont\"]/div/form/div/div[9]/input");
	public TamilMatrimonyRegister(WebDriver driver)
	{
		this.driver=driver;
	}
	public void RegisterProfile()
	{
		driver.findElement(profilefor).click();
	}
	public void RegisterName(String yourname)
	{
		driver.findElement(name).sendKeys(yourname);
	}
	public void MobileNumber(String num)
	{
		driver.findElement(number).sendKeys(num);
	}
	public void RegisterFree()
	{
		driver.findElement(register).click();
	}
	
}
