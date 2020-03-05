package cucumber;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class implicitwait {
	@Test
	public void implicit() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.findElement(By.id("username")).sendKeys("sanjeev");
		driver.findElement(By.id("password")).sendKeys("12345");
		WebDriverWait wait= new WebDriverWait(driver,10);
		WebElement element =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")));
		driver.findElement(By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button")).click();
		Thread.sleep(3000);
	}

}
