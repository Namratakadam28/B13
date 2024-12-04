package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTestingImpl 
{
@Test(dataProvider= "users")
 public void verifyLoginUsingMultipleUsers(String uname , String password)
  {
	   WebDriverManager .chromedriver().setup();
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://demo.guru99.com/test/newtours/index.php");
		  WebElement username =  driver.findElement(By.xpath("//input[@name='userName']"));
		  WebElement Password =  driver.findElement(By.xpath("//input[@name='password']"));
		  WebElement submit_button = driver.findElement(By.xpath("//input[@name='submit']"));
		  username.sendKeys("uname");
		  Password.sendKeys("password");
		  submit_button.click();
		  WebElement loginSuccesssfulMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
		  String loginSuccessfulMsgtxt	= loginSuccesssfulMsg.getText();
		  SoftAssert verify = new SoftAssert();
		  verify.assertEquals(loginSuccessfulMsgtxt, "Login Successfully");
		  verify.assertAll();
		  driver.quit();
  }

   @DataProvider(name = "users")
   
	   public String[][] userDataProvider()
	   {
		  String[][] usersData= {{"Admin" , "Admin"} ,{"Admin1,"Admin1"} , {"Admin2" , "Admin2"}};
		  	return usersData;
	   }
}

		  
