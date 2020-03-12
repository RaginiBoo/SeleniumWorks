package com.BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WapperClass {
protected WebDriver driver;
public void Launchapp(String Browser, String url)
{
	try {
	if (Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		driver = new ChromeDriver();
		}
	else if(Browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "Driver/geckodriver.exe");
			driver = new FirefoxDriver();	
		}
	else if(Browser.equalsIgnoreCase("Internet Explore")) {
	System.setProperty("webdriver.ie.driver", "Driver/IEDriverServer.exe");
		driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
	}
	catch(WebDriverException e){
System.out.println("Browser not launched");
}
}
public void CloseBrowser()
{
	driver.close();
	}
}

