package com.codemindB13;



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
   
}
