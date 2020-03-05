package TestngDemo;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SampleTestCase {
  @Test
  public void testcase1() {
	  System.out.println("Test Case 1");
  }
  @Test
  public void testcase2() {
	  System.out.println("Test Case 2");
  }
  @Test
  public void testcase3() {
	  System.out.println("Test Case 3");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Before Method: Launch the app");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method: Close the app");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class: Prepare Test Data");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class: Clear Test Data");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test: Open db Connection");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test: Close db Connection");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite: Smoke Testing ");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("After Suite: Generate Report ");
  }

}
