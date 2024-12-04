package seleniumpractices;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;
public class DropDownUsingSingleSelect 
{

	public static void main(String[] args) throws InterruptedException 
	{
		      WebDriverManager.chromedriver().setup();
		      WebDriver driver = new ChromeDriver();
			  driver.manage().window().maximize();
			  driver.get("https://omayo.blogspot.com/");
			   WebElement singleSelectDropDown = driver.findElement(By.xpath("//select[@id='drop1']"));
			   Select select = new Select(singleSelectDropDown);
			   List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
			   
			   for(WebElement option : allSelectedOptions)
			   {
				   System.out.println(option.getText());
			   }
		     System.out.println("*****************************************************");
		     WebElement firstSelectOption = select.getFirstSelectedOption();
		     System.out.println(firstSelectOption.getText());
		     
	         System.out.println("*****************************************************");
		     List<WebElement> allSelectOptions1 = select.getOptions();
		     for(WebElement allOption : allSelectOptions1)
		     {
		     System.out.println(allOption.getText());
		     }
		  
		    
	         System.out.println("*****************************************************");
             System.out.println("Multi selected is possible:"+select.isMultiple());
             System.out.println("*****************************************************");
	      //   select.selectByIndex(3);
	         select.selectByIndex(1);
	         Thread.sleep(2000);
	         select.selectByValue("def");
	         Thread.sleep(1000);
	         select.selectByVisibleText("doc 4");
             System.out.println("*******************************************************");
            
    }

}
