package com.testcase;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.base.base;
import com.page.offer_page;


public class offer_testcase extends base 
{
	@BeforeMethod
	public void before() 
	{
		url("chrome","https://www.phptravels.net/public/amadeus/offers/");
	}
	@Test
	public void home() throws InterruptedException, IOException
	{
		offer_page ll=new offer_page(driver);
		ll.currency();
		String b=ll.trip();
		System.out.println(b);
		Assert.assertEquals("Thanks For Contacting",b);
		screenshot("Screenshot\\php.png");
		
	}
	@AfterMethod
	public void after() 
	{
		close();
	}
}
