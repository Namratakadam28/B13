package com.codemind.newtours.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class utilities 
{

	
 public static String getProperty(String key)
 {
	 File file = new File("src/test/resources/data.properties");
	 FileInputStream fileinputstream;
	 Properties properties = null;
	 try
	 {
	 fileinputstream = new FileInputStream(file);
	 properties = new Properties();
	 properties.load(fileinputstream);
     }
	 catch(IOException e)
	 {
		 e.printStackTrace();
	 }
	 return properties.getProperty(key);
 }
 public static WebDriver browserUtility(String browser)
 {
	 WebDriver driver;
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	if(browser.equalsIgnoreCase("edge"))
	{
		WebDriverManager.edgedriver().setup();
		 driver = new EdgeDriver();
    }
	
	if(browser.equalsIgnoreCase("firefox"))
	{
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	}
	return driver;
 }
}