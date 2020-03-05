package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize(); //screen will display in full 
		
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);     //waiting time to open the output the browser then it will wait for the 30 sec for every lines.
		
		
		//using drop down menu box (Select option)
		Select day = new Select (driver.findElement(By.id("day"))); //for day
		day.selectByIndex(9);
		
		Select month = new Select (driver.findElement(By.id("month"))); //for month
		month.selectByVisibleText("Aug");
		
		Select year = new Select (driver.findElement(By.id("year"))); //for year
		year.selectByValue("1997");
		
		
		driver.findElement(By.className("_58mt")).click(); //for clicking the gender 
		
		
	}

}
