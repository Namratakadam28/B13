package seleniumpractices;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverMethods {
  public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println("current page url:"+driver.getCurrentUrl());
		System.out.println("page source:"+ "\n" + driver.getPageSource());
		System.out.println("Title of the page is:"+driver.getTitle());
		System.out.println("currenetly focused window handle:"+driver.getWindowHandle());

		driver.switchTo().newWindow(WindowType.TAB).get("https://omayo.blogspot.com/");
	    Set<String> windowhandles = driver.getWindowHandles();
	    System.out.println("number of windows open:"+windowhandles.size());
		
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.close();
		//driver.quit();	
		}
}


