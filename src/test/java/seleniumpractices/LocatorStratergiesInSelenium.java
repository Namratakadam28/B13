package seleniumpractices;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class LocatorStratergiesInSelenium
{

	public static void main(String[] args) throws IOException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement TextBoxArea= driver.findElement(By.id("ta1"));
		TextBoxArea.sendKeys("codemind");
		
		TextBoxArea.clear();
	//	Thread.sleep(1000);
		String colsvalue = TextBoxArea.getAttribute("cols");
        		

	//	System.out.println("If web element is not present");
		
	//   WebElement textfield1 = driver.findElement(By.id("xyz"));
		
	//	driver.findElement(By.xpath("//a[@href and @id]")).click();
		
		File textareascreenshot = TextBoxArea.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(textareascreenshot, new File("src/test/resources/test.png"));
		//FileUtils.copyFile(textareascreenshot, new File("src/test/resources/"+System.currentTimeMillis()+".png"));
		String tagname = TextBoxArea.getTagName();
		System.out.println("Tagname:"+tagname);
		
		driver.findElement(By.cssSelector("#but1"));
		
		System.out.println("TextBoxArea is displyed or not::"+TextBoxArea.isDisplayed());
		
		WebElement hiddenelement = driver.findElement(By.cssSelector("*[id='deletesuccess']"));
		System.out.println("hidden element is displayed="+hiddenelement.isDisplayed());
	}

}

