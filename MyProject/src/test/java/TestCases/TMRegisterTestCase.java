package TestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Library.WrapperEx;
import Pages.TamilMatrimonyLogin;
import Pages.TamilMatrimonyRegister;

public class TMRegisterTestCase extends WrapperEx
{

	@BeforeClass
	public void StartUp()
	{
		LaunchApp("chrome","https://www.tamilmatrimony.com/#");
	}
	@Test
	public void Register()
	{
		TamilMatrimonyRegister  TM= new TamilMatrimonyRegister(driver) ;
		TM.RegisterProfile();
		TM.RegisterName("Soundariya");
		TM.MobileNumber("9445600814");
		TM.RegisterFree();
	}
	@AfterClass
	public void Close()
	{
	quit();
	}
}
