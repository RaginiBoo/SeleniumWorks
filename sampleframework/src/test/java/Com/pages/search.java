package Com.pages;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class search {
	WebDriver driver;
	WebElement textbox;

	public void url() {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.carwale.com/");

	}
public void search()
{
	driver.findElement(By.id("newCarsList")).sendKeys("BMW");
}
public void enter_search_name()
{
	 driver.findElement(By.linkText("bmwx1")).click();;
	
}
}
