package keyword;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObjDen
{
		WebDriver driver;
		By searchword=By.name("q");
		
		public void OpenBrow()
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
			driver=new ChromeDriver();

		}
	    public void SetUrl()
	    {
	    	driver.manage().window().maximize();
			driver.get("https://google.com");
	    }
	    
	    public void Search(String st)
	    {
	    driver.findElement(searchword).sendKeys(st);	
	    	
	    }
	    public void closeBrow()
	    {
	    	driver.close();
	    }

}
