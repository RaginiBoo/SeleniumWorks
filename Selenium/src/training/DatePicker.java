package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize(); //screen will display in full 
		
		//onward date selection from RedBus Calendar
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[3]/div/label")).click(); //to click the onwards date
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[5]/td[5]")).click(); //To display the selected date on the onward date
		
		//return date selection from RedBus Calendar
		driver.findElement(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[4]/div/label")).click(); 
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_return_cal\"]/table/tbody/tr[1]/td[2]")).click();
		
		
		
	}

}
