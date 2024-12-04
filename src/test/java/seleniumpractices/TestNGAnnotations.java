package seleniumpractices;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;

public class TestNGAnnotations 
{
	   @BeforeSuite
		public void beforeSuite()
		{
		   System.out.println("Before suite");
		}
	   @AfterSuite
	   public void afterSuite() 
	   {
		   System.out.println("After suite");
	   }
	   
	   @BeforeTest
		public void afterTestPlan()
		{
		   System.out.println("After test plan");
		}
	   @AfterTest
	   public void beforeTestPlan()
	   {
		   System.out.println("After test");
	   }
	   @BeforeClass
	   public void beforeClass()
	   {
		   System.out.println("Before class");
	   }
	   @AfterClass
	   public void afterClass()
	   {
		   System.out.println("After class");
	   }
	   @BeforeMethod
	   public void beforeMethod()
	   {
		   System.out.println("Before method");
	   }
	   @AfterMethod
	   public void AfterMethod()
	   {
		   System.out.println("after method");
	   }
	   @Test
	   public void verifyValidLogin()
	   {
		   System.out.println("Test Case");
	   }
	}



