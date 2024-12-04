package com.codemind.newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginSuccessPage 
{
	//Web driver reference variable 
WebDriver driver;
WebElement loginSuccessfullyMsg;
WebElement getCopyRightMsg;
public void loginSuccessPage(WebDriver driver)
  {
	this.driver=driver;
  }
public WebElement getLoginSuccessfullyMsg() 
  {
	return driver.findElement(By.xpath("//h3[text()='Login Successfully']"));
  }
	
 public String getLoginSuccessfullyMsgText()
	{
		return getLoginSuccessfullyMsg().getText();
	}
 public WebElement getCopyRightMsg()
  {
	 return driver.findElement(By.xpath("//div[contains(text(),'2005')]"));
  }
 public String getCopyRightMsgText()
 {
	 return getCopyRightMsg().getText();
 }
}
