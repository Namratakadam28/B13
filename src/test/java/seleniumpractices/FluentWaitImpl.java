package seleniumpractices;

import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FluentWaitImpl {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
    	WebDriver driver = new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://omayo.blogspot.com/");
    	WebElement delayedText = driver.findElement(By.cssSelector("#delayedText"));
    	FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(3))
    			.ignoring(TimeoutException.class).pollingEvery(Duration.ofMillis(100));
    	System.out.println("Element visisble before explicit wait="+delayedText.isDisplayed());
    	wait.until(ExpectedConditions.visibilityOf(delayedText));
    	System.out.println("Element visisble after explicit wait="+delayedText.isDisplayed());
    	

	}

}
