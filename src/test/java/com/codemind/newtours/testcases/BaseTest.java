package com.codemind.newtours.testcases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.codemind.newtours.utility.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;

 public class BaseTest 
 {
 WebDriver driver;
 
 @BeforeMethod(alwaysRun = true)
 public void setup()
 
 {
	 
	 driver = utilities.browserUtility(utilities.getProperty("browser"));
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Long.valueOf(utilities.getProperty("timeout"))));
	 driver.get(utilities.getProperty("url"));
 }
  @AfterMethod(alwaysRun = true)
  public void tearDown()
  {
	  driver.quit();
  }
}
