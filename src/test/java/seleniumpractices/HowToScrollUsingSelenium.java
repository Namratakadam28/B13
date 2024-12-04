package seleniumpractices;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HowToScrollUsingSelenium
{
   public static void main(String args[]) throws InterruptedException
   {
	   WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://omayo.blogspot.com/");

		JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		javascriptExecutor.executeScript("window.scrollBy(0,3000)", "");
		Thread.sleep(1000);
	    javascriptExecutor.executeScript("windows.scrollBy(0,-500)" , "");
	   //Thread.sleep(2000);
	 //  javascriptexecutor.executeScript("windows.scrollBy(100 , 0)");
	   // Thread.sleep(2000);
	    // javascriptexecutor.executeScript("windows.scrollBy(-100 , 0)");
	   
	//   javascriptexecutor.executeScript("window.scrollBy(document.body.scrollWidth,0)");
	  // javascriptexecutor.executeScript("window.scrollBy(document.body.scrollHeight,0)");
	   
	//   javascriptexecutor.executeScript("argument[0].scrollIntoView();",driver.findElement
	  // 		(By.xpath("//button[@value='LogIn']")));
	   		
	   
   }
}
