package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultiSelectInSelenium
{
  public static void main(String args[]) throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
      WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://omayo.blogspot.com/");
	
	  WebElement multiselectdropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
      Select select1 = new Select(multiselectdropdown);
      select1.selectByIndex(0);
      select1.selectByValue("Hyundaix");
      select1.selectByVisibleText("Audi");
      
      List<WebElement> allselectedoptions = select1.getAllSelectedOptions();
      for(WebElement option : allselectedoptions)
      {
     	 System.out.println(option.getText());
      }
     
      System.out.println("**********************************************************");
      WebElement firstselectedoption = select1.getFirstSelectedOption();
      System.out.println(firstselectedoption.getText());
      
      System.out.println("**********************************************************");
      List<WebElement> alloptionsfromdropdown1 = select1.getOptions();
      for(WebElement option : alloptionsfromdropdown1)
      {
    	  System.out.println(option.getText());
      }
      System.out.println("***********************************************************");
      System.out.println("Multiselect is allowed:"+select1.isMultiple());
      System.out.println("*************************************************************");
     select1.deselectAll();
      select1.selectByIndex(0);
      select1.selectByValue("Hyundaix");
      select1.selectByVisibleText("Audi");
      System.out.println("************************************************************");
      Thread.sleep(2000);
      select1.deselectByIndex(0);
     select1.deselectByValue("Hyundaix");
      select1.deselectByVisibleText("Audi");
 
 
  }
}
