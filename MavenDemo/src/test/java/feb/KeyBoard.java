package feb;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeyBoard 
{

	@Test
	public void key()
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().window().maximize();
		driver.findElement(By.className("nav__button-secondary")).click(); //signin
		driver.findElement(By.id("username")).sendKeys("raginiboobalan"); //username
		
		//for password
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform(); //one tab to next tab
		action.sendKeys("12345");
		//action.sendKeys(Keys.ENTER).perform();   (or)
		action.sendKeys(Keys.RETURN).perform();
		
	}
}
