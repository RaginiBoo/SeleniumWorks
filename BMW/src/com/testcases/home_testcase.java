package com.testcases;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.base;
import com.excel.excel_util;
import com.pages.home_page;

public class home_testcase extends base {

	
	
@BeforeClass
	
public void before()
{  
	launchapp("chrome","https://www.bmw.in/en/");
	
}




@Test

public void testcase() throws InterruptedException, IOException
{
	home_page hp=new home_page(driver);                   
	excel_util ex=new excel_util();                       
	 
	hp.bmw_method();                                     
	screenshot("Screenshot//output.png");              
	
	int b=Integer.parseInt(hp.topspeed());              
	String c="Does not meet my requirement";
	
	if(b<500)
	{
		ex.requirements(c);                             
	}
	
	}




@AfterClass

public void after()
{
	close_app();
	
}


}
