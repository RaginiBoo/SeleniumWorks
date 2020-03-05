package training;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerLogin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.ie.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/iedriverserver.exe");
		WebDriver driver =  new InternetExplorerDriver();
		driver.get("https://facebook.com/");
	}

}
