package Com.Baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WrapperClass {
		protected WebDriver driver;
			
			public void launchApplication(String browser, String url) {
				
				try {
					//To launch firefox BROWSER
					if (browser.equalsIgnoreCase("firefox")) {
						driver = new FirefoxDriver();
					}
					// TO launch Chrome Browser
					else if (browser.equalsIgnoreCase("chrome")) {
						System.setProperty("webdriver.chrome.driver","src//test//resources//Driver//chromedriver.exe");
						driver=new ChromeDriver();

					}
               //to maximize the window
					driver.manage().window().maximize(); 
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
					driver.get(url);
				
				} catch (WebDriverException e) {
					System.out.println(" browser could not be launched");
				}
			
			}
			// To Take Screenshot
			public void screenshot(String path) throws IOException
			{
				TakesScreenshot ts=((TakesScreenshot)driver);
				File Source=ts.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(Source,new File(path));
			}
			//To close the browser
		   public void quit(){
				
				driver.close();
		   }
		  
		}


