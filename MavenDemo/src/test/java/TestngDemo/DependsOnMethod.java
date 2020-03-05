package TestngDemo;


import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethod {

	@Test
	public void login()
	{
		System.out.println("Login to the application");
	}
	@Test(dependsOnMethods= { "login"} )
	public void search()
	{
		System.out.println("Searching the application");
		Assert.assertEquals("abc", "xyz"); //false statement
	}
	@Test(dependsOnMethods= { "search"}, alwaysRun = true )   //false or true comment
	public void logout()
	{
		System.out.println("logout the application");
	}
}
