package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();  
		
		// Frame handling for jquery iu
				driver.get("https://jqueryui.com/droppable/");
				
				//for droppable
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				WebElement a = driver.findElement(By.id("draggable"));
				WebElement b = driver.findElement(By.id("droppable"));
				
				Actions c = new Actions(driver);
				c.dragAndDrop(a,b).perform();
				
				
				
	}

}
