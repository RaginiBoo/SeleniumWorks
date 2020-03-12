package com.TestCase;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import com.BaseClass.WapperClass;
import com.Pages.RoyalCaribbean;


public class RoyalCaribbean_TestCase extends WapperClass {
	
@BeforeClass
public void startup()
	{
		Launchapp("chrome","https://www.royalcaribbean.com/alaska-cruises");
	}
@Test
public void  alska() throws InterruptedException 
{
	RoyalCaribbean rc =new RoyalCaribbean(driver);
	int b=rc.checklink();
	rc.PlanCruise();
	
//}
//@Test
//public void Royal()
//{RoyalCaribbean rc =new RoyalCaribbean(driver);
	
	String a=rc.royal();
	//driver.get("https://www.royalcaribbean.com/alaska-cruises");
	
	boolean c=false;
	if(a.equals("Royal Suite")&&b==1) {
		c=true;
		Assert.assertTrue(c);	
	}
	else {
		Assert.assertTrue(c);
	}
}

@AfterClass
public void Close()
	{
	
		CloseBrowser();
	
	}
}

