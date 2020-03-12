package com.base;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class base 
{
protected WebDriver driver;

public void url(String browser,String link)
{   
	try
{
	if(browser.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","Driver\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	else if(browser.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.gecko.driver","Driver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else if(browser.equalsIgnoreCase("internetexplorer"))
	{
		System.setProperty("webdriver.ie.driver","Driver\\ie.exe");
		driver=new InternetExplorerDriver();	
	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get(link);
}
	catch(WebDriverException e)
{
  System.out.println("browser cant be launched");		
}
}
public void screenshot(String path) throws IOException
{
	TakesScreenshot ts=(TakesScreenshot)driver;
	File f=ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(f,new File(path));
}
public void close()
{
	driver.close();
}
}
