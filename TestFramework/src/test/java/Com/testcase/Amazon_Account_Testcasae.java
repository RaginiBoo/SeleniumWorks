package Com.testcase;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Com.Baseclass.WrapperClass;
import Com.pages.Amazon_Accounts_page;
import Com.pages.Amazon_search_page;

public class Amazon_Account_Testcasae extends WrapperClass{
	@BeforeClass
	public void startup() 
	{
		launchApplication("chrome","https://www.amazon.in/");	
	}
	@Test
	public void move() {
		Amazon_Accounts_page Apage=new Amazon_Accounts_page(driver);
		Apage.move();
	}
	@AfterClass
	public void close() throws IOException
	{
		screenshot("src\\test\\resources\\Screenshot\\account.png");
		quit();
	}
}
