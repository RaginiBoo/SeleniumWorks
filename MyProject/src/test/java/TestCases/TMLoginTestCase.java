package TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import Pages.TamilMatrimonyLogin;

public class TMLoginTestCase extends WrapperEx
{

	@BeforeClass
	public void StartUp()
	{
		LaunchApp("chrome","https://www.tamilmatrimony.com/#loginpopup");
	}
	@Test
	public void Login()
	{
		TamilMatrimonyLogin  TM= new TamilMatrimonyLogin(driver) ;
		TM.LoginUsername("raginiboobalan@gmail.com");
		TM.LoginPassword("123456789");
		TM.LoginButton();
	}
	@AfterClass
	public void Close()
	{
	quit();
	}
}
