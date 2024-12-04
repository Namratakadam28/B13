package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorStratergiesImpl
{
  public static void main(String args[])
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://omayo.blogspot.com/");
	  driver.manage().window().maximize();
	  WebElement usernametextbox = driver.findElement(By.name("userid"));
	  usernametextbox.sendKeys("This is username textbox");
	  
	  WebElement TextAreaField = driver.findElement(By.id("ta1"));
	  TextAreaField.sendKeys("This is text area field");
	  
	  WebElement Title = driver.findElement(By.className("title"));
	 System.out.println(Title.getText()); 
    
     List<WebElement> Button = driver.findElements(By.tagName("button"));
      System.out.println("Number of buttons:"+Button.size());
      List<WebElement> TextBox = driver.findElements(By.tagName("input"));
      System.out.println("Number of input fields:"+TextBox.size());
    }
}
