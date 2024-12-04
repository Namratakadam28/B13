package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNgAssertion 
{
@Test
 public void verifyValidLogin()
 {
	 WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.guru99.com/test/newtours/index.php");
		//WebElement username = driver.findElement(By.xpath("//input[@name = 'userName']"));
		WebElement username = driver.findElement(By.cssSelector("input[name='userName']"));
		WebElement password = driver.findElement(By.cssSelector("input[name='password']"));
		
		//WebElement password = driver.findElement(By.xpath("//input[@name = 'password']"));
	
		//WebElement submit = driver.findElement(By.xpath("//input[@name = 'submit']"));
		WebElement submit = driver.findElement(By.cssSelector("input[name='submit']"));
		
		
		username.sendKeys("Admin");
		password.sendKeys("Admin");
		submit.click();
		
		WebElement loginSuccessfulMsg = driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
	    String loginSuccMsgText = loginSuccessfulMsg.getText();
		SoftAssert verify = new SoftAssert();
		verify.assertEquals(loginSuccMsgText, "Login Successfully");
	   verify.assertTrue(loginSuccMsgText.equals("Login Successfully"),"Assert true related assertion failed at line number 42");
	   
	   WebElement copywriteYear = driver.findElement(By.xpath("//div[contains(text(),'2005')]"));

		
		String msg =  copywriteYear.getText();
	
		String a[] = msg.split(" ");
		System.out.println("copywrite year="+a[1].replace(",", ""));
		verify.assertNotEquals(a[1].replace(",", ""), "2023","copywrite year is 2005");
		verify.assertFalse(a[1].replace(",", "").equals("2024"), "copywrite year is 2024");
		verify.assertAll();
		}
}
