package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownNotComingUnderSelectTag
{
   public static void main(String args[]) throws InterruptedException
   {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://omayo.blogspot.com/");
	  WebElement element = driver.findElement(By.xpath("//button[text()='Dropdown']"));
	  element.click();
	  Thread.sleep(500);
	  
	  List<WebElement> dropdownoptions = driver.findElements(By.xpath("//div[@id='myDropdown']"));
	  for(WebElement options : dropdownoptions )
	  {
		  System.out.println(options);
	  }
   }
}
                                   