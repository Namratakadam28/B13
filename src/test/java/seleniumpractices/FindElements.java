package seleniumpractices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements 
{
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.id("xwl"));
		System.out.println("number of elements:"+elements.size());
		
		List<WebElement> elements1 = driver.findElements(By.id("tb2"));
		System.out.println("number of elements:"+elements1.size());
		
		List<WebElement> elements2 = driver.findElements(By.id("xyz"));
		System.out.println("number of elements:"+elements2.size());
		
		List<WebElement> elements3 = driver.findElements(By.tagName("button"));
		System.out.println("number of buttons:"+elements3.size());
		
		
	}
}
