package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().window().maximize();  
		
		// Frame handling for jquery iu
				driver.get("https://jqueryui.com/droppable/");
				
				//for selectable
				driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
				
				WebElement Element1 = driver.findElement(By.className("//*[@id=\"selectable\"]/li[1]"));
				WebElement Element2 = driver.findElement(By.className("//*[@id=\"selectable\"]/li[2]"));
				WebElement Elemen3 = driver.findElement(By.className("//*[@id=\"selectable\"]/li[3]"));
				WebElement Element4 = driver.findElement(By.className("//*[@id=\"selectable\"]/li[4]"));
				
				Actions action = new Actions(driver);
				action.clickAndHold(Element1).clickAndHold(Element4).release().build().perform();
				
				Actions c = new Actions(driver);
	}

}
