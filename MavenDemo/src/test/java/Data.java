import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {
WebDriver driver;
		@Test(dataProvider = "Testdata") 
		public void login(String username, String password) 
		{ 
		 driver.findElement(By.id("username")).sendKeys(username); 
		 driver.findElement(By.id("password")).sendKeys(password); 
		 driver.close(); 
		 } 
	
		@BeforeMethod 
		public void beforeMethod() { 
			System.setProperty("webdriver.chrome.driver","C:\\Users\\BLTuser.BLT1227\\Desktop\\Software\\chromedriver.exe");
		 driver = new ChromeDriver(); 
		 driver.manage().window().maximize(); 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin"); 
		 } 
		@DataProvider (name= "Testdata") 
		public Object[][] getdata() { 
		 Object[][] data = new Object[3][2] ; 
		 data [0][0] = "user1"; 
		 data [0][1] ="password1"; 
		 data [1][0] ="user2"; 
		 data [1][1] ="password2"; 
		 data [2][0] ="user3"; 
		 data [2][1] ="password3"; 
		 
		return data; 
		 } 
		}
