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
public class WebDriverMethodsImp
{
	public static void main(String[] args) throws Exception
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement TextBoxArea= driver.findElement(By.id("ta1"));
		TextBoxArea.sendKeys("codemind");
		TextBoxArea.clear();
		Thread.sleep(1000);
		
		TextBoxArea.sendKeys("Welcome to codemind");
		String colsvalue = TextBoxArea.getAttribute("cols");
		System.out.println("Textarea field is equal to:"+TextBoxArea.isEnabled());
	
		File textarea2screenshot = TextBoxArea.getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(textareascreenshot, new File("src/test/resources/test.png"));
		FileUtils.copyFile(textarea2screenshot, new File("src/test/resources/"+System.currentTimeMillis()+".png"));
		
		String tagname = TextBoxArea.getTagName();
		System.out.println("Tagname of text area field:"+tagname);
		
		WebElement Form = driver.findElement(By.name("form1"));
		String tagname2 = Form.getTagName();
		System.out.println("Tagname of HTML form:"+tagname2);
		
		WebElement getbuttonattribute=driver.findElement(By.cssSelector("#but2"));
		String buttonvalue = getbuttonattribute.getAttribute("button");
		System.out.println(buttonvalue);
		
		WebElement disabledbutton=driver.findElement(By.cssSelector("#but1"));
	    System.out.println(disabledbutton.getText());
		System.out.println("button 1 is enabled or disabled:"+disabledbutton.isEnabled());
		
		System.out.println("Button is displayed or not:"+getbuttonattribute.isDisplayed());
		System.out.println("TextBoxArea is displyed or not::"+TextBoxArea.isDisplayed());
		
		WebElement hiddenelement = driver.findElement(By.cssSelector("*[id='deletesuccess']"));
		System.out.println("hidden element is displayed="+hiddenelement.isDisplayed());
		
	    WebElement maleradiobtn = driver.findElement(By.cssSelector("input#radio1"));
	    System.out.println("male radio btn is selected:"+maleradiobtn);
	    
	    WebElement femaleradiobtn = driver.findElement(By.cssSelector("input#radio2"));
	    femaleradiobtn.click();
	    System.out.println("female radio btn is selected:"+femaleradiobtn);
	    
	    WebElement orangecheckbox = driver.findElement(By.cssSelector("input#checkbox1"));
	    System.out.println("Orange checkbox is selected:"+orangecheckbox);
	    
	    WebElement bluecheckbox = driver.findElement(By.cssSelector("input#checkbox2"));
	    System.out.println("Blue checkbox is selected:"+bluecheckbox);
	    
	    
	    
	}
}
