package com.codemind.newtours.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.codemind.newtours.utility.utilities;
import com.codemind.newtourspages.HomePage;
import com.codemind.newtourspages.LoginSuccessPage;

public class VerifyValidLogin extends BaseTest
{
	HomePage homePage;
	LoginSuccessPage loginSuccessPage;
@Test
public void VerifyValidLogin()
{
	homePage = new HomePage(driver);
	loginSuccessPage = new LoginSuccessPage();
	homePage.setUsernameField(utilities.getProperty("username"));
	homePage.setPasswordfield(utilities.getProperty("password"));
	homePage.getSubmitBtn();
	assertEquals(loginSuccessPage.getLoginSuccessfullyMsgText() , "Login Successfully");
	  assertTrue(loginSuccessPage.getCopyRightMsgText().equals("Login Successfully"));
	  
	  
	  
}
@Test
public void VerifyHomePageTitle()
{
	Assert.assertEquals(driver.getTitle(), "Welcome : Mercury Tours","Title is not matching");
}
}
