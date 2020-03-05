package TestCase;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import Page.LinkedinLogin;

public class LoginPageTestCase extends WrapperEx
{
	@BeforeClass
	public void StartUp()
	{
		LaunchApp("chrome","https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}
	@Test
	public void Login()
	{
		LinkedinLogin lpage= new LinkedinLogin(driver) ;
		lpage.LoginToAppUsername("raginiboobalan@gmail.com");
		lpage.LoginToAppPassword("123456789");
		lpage.SignInButton();
	}
	@AfterClass
	public void Close()
	{
	quit();
	}
}
