package SeleniumDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
	}

}
