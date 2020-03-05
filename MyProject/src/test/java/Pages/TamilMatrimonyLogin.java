package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TamilMatrimonyLogin 
{
	WebDriver driver;
    By login = By.linkText("Log in");
	By emailid= By.id("ID");
	By password= By.xpath("/html/body/center/div[1]/div/form/div[7]/input[1]");
	By loginbutton= By.xpath("//*[@id=\"loginpopup\"]/div/form/div[10]/input[3]");
	public TamilMatrimonyLogin(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Login(String userid)
	{
		Set<String>winHandles=driver.getWindowHandles();
		System.out.println("The number of window handles are " +winHandles.size());
		for(String winHandle:winHandles)
		{
			driver.switchTo().window(winHandle);
		}
	}
	public void LoginUsername(String userid)
	{
		driver.findElement(emailid).sendKeys(userid);
	}
	public void LoginPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void LoginButton()
	{
		driver.findElement(loginbutton).click();
	}
}
