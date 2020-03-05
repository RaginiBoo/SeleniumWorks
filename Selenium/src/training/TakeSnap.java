package training;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeSnap {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File Source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Source, new File("C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\eclipse-workspace\\Selenium\\ScreenShot\\ScreenShot.png") );
		
				
	}

}
