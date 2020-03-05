package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HDFCBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		
		driver.manage().window().maximize(); //screen will display in full 
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);     //waiting time to open the output the browser then it will wait for the 30 sec for every lines.
		
		//Mouse ation
		WebElement a = driver.findElement(By.xpath("/html/body/div[1]/div[1]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a/span[2]"));
		WebElement b = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[13]/div[3]/div[3]/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/ul/li[2]/ul/li[2]/a/span"));
		
		Actions c = new Actions(driver);
		c.moveToElement(a);
		c.moveToElement(b).click().build().perform();
		
		
		
		
		
	}

}
