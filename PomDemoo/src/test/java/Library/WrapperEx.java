package Library;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


//launching code and closing code
public class WrapperEx
{
	protected WebDriver driver;
	public void LaunchApp(String browser,String url)
	{
		try
		{
			if (browser.equalsIgnoreCase("firefox")) 
			{
				driver = new FirefoxDriver();
			} 
			else if (browser.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
				driver=new ChromeDriver();

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.get(url);
		} 
		catch (WebDriverException e) 
		{
			System.out.println(" browser could not be launched");
		}
	}
	
   public void quit()
   {
		driver.close();
	}
}
