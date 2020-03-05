package PracticeApplication;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GitUpMethod {
	WebDriver driver;
	
	
	public void launchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		driver =  new ChromeDriver();
		driver.get(url); 
		driver.manage().window().maximize();
	}
	
	
	public void clickbyxpath(String path)
	{
		driver.findElement(By.xpath(path)).click();
	}
	
	
	public void enterbyid(String locator,String value)
	{
		driver.findElement(By.id(locator)).sendKeys(value);
	}
	
	
	public void moveto(String path)
	{
		WebElement a = driver.findElement(By.xpath(path));
		WebElement b = driver.findElement(By.xpath(path));
		
		Actions c = new Actions(driver);
		c.moveToElement(a);
		c.moveToElement(b).click().build().perform();
	}
	
	
	public void screenshot(String path1) throws IOException
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path1) );
	}
	
	
	public void closeapp()
	{
		driver.close();
	}
	
}
