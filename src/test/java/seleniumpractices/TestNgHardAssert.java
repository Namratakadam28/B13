package seleniumpractices;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgHardAssert 
{
  @Test
  public void VerifyValidLogin()
  {
	  WebDriverManager .chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.guru99.com/test/newtours/index.php");
	  WebElement username =  driver.findElement(By.xpath("//input[@name='userName']"));
	  WebElement password =  driver.findElement(By.xpath("//input[@name='password']"));
	  WebElement submit_button = driver.findElement(By.xpath("//input[@name='submit']"));

	  username.sendKeys("Admin");
	  password.sendKeys("Admin");
	  submit_button.click();
	  WebElement loginsuccessfulmsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	  String loginsuccessfulmsgtext = loginsuccessfulmsg.getText();
	  assertEquals(loginsuccessfulmsgtext , "Login Successfully");
	  assertTrue(loginsuccessfulmsgtext.equals("Login Successfully"));
	  WebElement copywriteyear = driver.findElement(By.xpath("//div[contains(text(),'2005')]"));
      String msg = copywriteyear.getText();
      String a[] = msg.split(" ");
      System.out.println("copywrite year = " + a[1]);
      assertNotEquals(a[1].replace(",", ""), "2024");
      assertFalse(a[1].replace(",", "").equals("2024"));  
	  
  }
  
}
