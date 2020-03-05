package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WrapperMethod {
 WebDriver driver;
	public void launchapp(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
	driver =  new ChromeDriver();
		driver.get(url); //calling the app
		driver.manage().window().maximize();
	}
	
	//xpath method
	public void clickbyxpath(String path)
	{
		driver.findElement(By.xpath(path)).click();
	}
	
	//enter by id method 
	public void enterbyid(String locator, String value)
	{
		driver.findElement(By.id(locator)).sendKeys(value);
	}
	
	//screenshot code
	public void screenshot(String path1) throws IOException
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File(path1) );
	}
	
	//closing the app
	public void closeapp()
	{
		driver.close();
	}
}
