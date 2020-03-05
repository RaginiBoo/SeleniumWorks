package Com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class version {
	WebDriver driver;
	WebElement textbox;

	public void url3() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.carwale.com/bmw-cars/x1/");
		driver.manage().window().maximize();
	}
	
	public void version()
	{
		 driver.findElement(By.linkText("xDrive20d M Sport")).click();
		
		
	}
	public void city()
	{
		driver.findElement(By.xpath("//*[@id=\"divModelDesc\"]/div[2]/div[2]/div/div/div/span")).sendKeys("Chennai");
//		driver.findElement(By.partialLinkText("Chenguvetti")).click();
	}
}
