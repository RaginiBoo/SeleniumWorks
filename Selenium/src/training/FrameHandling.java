package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();  
		
		// Frame handling for jquery iu
				driver.get("https://jqueryui.com/draggable/");
				
				driver.switchTo().frame(driver.findElement(By.className("demo-frame"))); //OUTER FRAME
				System.out.println(driver.findElement(By.xpath("//*[@id=\"draggable\"]/p")).isDisplayed()); //displaying the inner frame 
				driver.switchTo().defaultContent();
				driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	}

}
