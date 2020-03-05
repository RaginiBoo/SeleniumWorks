package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLogin {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:/Users/BLTuser.BLT1227/Desktop/Software/chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.linkedin.com/");
		
		// driver.findElement(By.className("nav__button-secondary")).click();   
		
		//Signin the linkedin page
 // driver.findElement(By.id("username")).sendKeys("raginiboobalan@gmail.com");
//		driver.findElement(By.id("password")).sendKeys("Kuttyponnaee");
//		driver.findElement(By.xpath("/html/body/div/main/div/form/div[3]/button")).click(); //absolute xpath
		//driver.close();      	//current tab
		//driver.quit(); 		//browser close ie all tabs close 
		
		
	//	Join now 
		//driver.findElement(By.linkText("Join now")).click();   
		//driver.findElement(By.partialLinkText("Join")).click();
		
		//driver.findElement(By.xpath("/html/body/main/section[3]/div/a")).click();  
		
		//xpath in absolute path
		//driver.findElement(By.xpath("//*[@ class= 'pill pill--talent-finder-cta']")).click();
		
		//using AND (dynamic)
		//driver.findElement(By.xpath("//* [@ data-tracking-control-name= 'homepage-basic_talent-finder-cta' and @ class= 'pill pill--talent-finder-cta']")).click();
		
		//Using OR 
		//driver.findElement(By.xpath("//* [@ data-tracking-control-name= 'guest_homepage-basic_nav-header-signin' or @ class= 'pill pill--talent-finder-cta']")).click();
		
		
		// Contains 
		//driver.findElement(By.xpath("//* [contains(@id, 'first-name-ember18')]")).sendKeys("Ragini");
	
		//Starts with
		//driver.findElement(By.xpath("//* [starts_with(@id, 'first-name-ember18')]")).sendKeys("Ragini");
		
		
		
		
	}

}
