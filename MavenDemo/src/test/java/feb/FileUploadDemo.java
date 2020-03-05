package feb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUploadDemo 
{

	@Test
	public void upload()
	{
	System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://filebin.net/");
	
	driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Jellyfish.jpg");
	driver.findElement(By.id("fileField")).sendKeys("C:\\Users\\Public\\Pictures\\Sample Pictures\\Desert.jpg");
	
	
	}
}
