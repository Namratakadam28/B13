package seleniumpractices;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellelExecutionInTestng 
	{
		  WebDriver driver;
		  public void setup()
		  {
			  WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			  driver.manage().window().maximize();
		      driver.get("https://demo.guru99.com/test/newtours/index.php");	  
		  }
		  @Test(priority = 1, groups = { "regression" })
		  public void c()
		  {
			  WebElement Username = driver.findElement(By.xpath("//input[@name='userName']"));
			  WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
			  WebElement submitbtn = driver.findElement(By.xpath("//input[@name='submit']"));
			  Reporter.log("before entering username");
			  Username.sendKeys("Admin");
			  Reporter.log("After entering username");
			  Reporter.log("Before entering password");
			  Password.sendKeys("Admin");
			  Reporter.log("After entering password");
			  Reporter.log("Before clicking on button");
			  submitbtn.click();
			  Reporter.log(" clicking on button");
			  WebElement loginSuccessfulMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));

			 String loginSuccMsgText = loginSuccessfulMsg.getText();
			 SoftAssert verify = new SoftAssert();
			 verify.assertEquals(loginSuccMsgText, "Login Successfully");
			 verify.assertAll();
		  }
		  @Test(priority = 1 ,groups= {"smoke" , "regression"})
		  public void B()
		  {
			  assertEquals(driver.getCurrentUrl(), "https://demo.guru99.com/test/newtours/index.php",
						"url is not equal to https://demo.guru99.com/test/newtours/index.php");
		  }
		  @Test(priority = 1 ,groups= {"sanity"})
		  public void Z()
		  {
			  assertEquals(driver.getTitle(), "Welcome: Mercury Tours", "title is not equal to Welcome: Mercury Tours");
			  
		  }
		  /*

		  public void tearDown()
		  {
			  driver.quit();
		  }
		  */
}
