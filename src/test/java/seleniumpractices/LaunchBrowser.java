package seleniumpractices;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser 
{

	public static void main(String[] args) 
	{
	//  WebDriverManager.edgedriver().setup();
	 // WebDriver driver = new EdgeDriver();	
	  // driver.get("https://www.google.com");
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("http://www.google.com");
	// driver.manage().window().maximize();
	 //driver.manage().window().minimize();
	 driver.manage().window().fullscreen();
	}

}
