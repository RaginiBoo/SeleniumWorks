package training;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().window().maximize();  
		
		// Alert Message handling for PRTC
				driver.get("http://www.busindia.com/PRTC-Pondicherry-Online-Booking.jsp");
				
				driver.findElement(By.xpath("//*[@id=\"searchForm\"]/div[3]/div[1]/div/div/div/div[1]/div[8]/button")).click();
				
				Alert a = driver.switchTo().alert();
				System.out.println(a.getText());
				a.accept(); //clicking OK button
				a.dismiss(); //Clicking CANCEL button
				a.sendKeys("RAgini"); //passing values
				driver.close();
				
		
		
		
		
		
		
		
		
		
	}
	
}
