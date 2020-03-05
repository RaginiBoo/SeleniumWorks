package TestngDemo;

import org.testng.annotations.Test;

public class DependsonGroup 
{

	@Test(groups= {"functional testing","retesting testing"})
	public void testcase1()
	{
		System.out.println("test case 1");
	}
	@Test(groups= {"functional testing","smoke testing"})
	public void testcase2()
	{
		System.out.println("test case 2");
	}
	@Test(groups= {"regression testing","smoke testing"})
	public void testcase3()
	{
		System.out.println("test case 3");
	}
	
}
