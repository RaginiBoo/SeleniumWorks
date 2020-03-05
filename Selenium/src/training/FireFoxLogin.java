package training;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLogin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://facebook.com/");

	}

}
