package seleniumpractices;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenersImpl implements ITestListener{

	public boolean isEnabled() 
	{
		
		System.out.println("Enabled");
	}

	public void onTestStart(ITestResult result)
	{
		
	System.out.println("Test started");
	}

	public void onTestSuccess(ITestResult result) 
	{
		
		
		System.out.println("test suceesss");
	}

	public void onTestFailure(ITestResult result) 
	{
		System.out.println("test failure");
		
	}

	public void onTestSkipped(ITestResult result)
	{
		
		System.out.println("skipped test cases");
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		
		System.out.println("failed with success percentage");
	}

	public void onTestFailedWithTimeout(ITestResult result)
	{
		
		System.out.println("time out");
	}

	public void onStart(ITestContext context)
	{
			System.out.println("Test case started");
			Reporter.log("Test case started");
	}

	public void onFinish(ITestContext context) 
	{
		System.out.println("Test case finished");
		Reporter.log("Test case finished");
	}

}
