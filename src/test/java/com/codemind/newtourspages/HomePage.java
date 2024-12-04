package com.codemind.newtourspages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
 WebDriver driver;
 WebElement UsernameField;
 WebElement Passwordfield;
 WebElement SubmitBtn;
 
 public HomePage(WebDriver driver)
 {
	 this.driver = driver;
 }
 
 public WebElement getUsernameField() 
 {
	return driver.findElement(By.xpath("//input[@name='userName']"));
 }

public WebElement getPasswordfield() 
{
	return Passwordfield;
}

public WebElement getSubmitBtn() 
{
	return SubmitBtn;
}
public void setUsernameField(String userName)
{
	getUsernameField().sendKeys(userName);
}
public void setPasswordfield(String password)
{
	getPasswordfield().sendKeys(password);
}


}
