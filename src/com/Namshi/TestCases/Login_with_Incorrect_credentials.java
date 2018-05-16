package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.NewLoginPage;

import Helper.BrowserFactory;

public class Login_with_Incorrect_credentials {

	
	@Test(description="Verify If user Logs In with invalid credentials")
	public void login_wrong_credentials()
	{
	
	WebDriver driver = BrowserFactory.start_Browser("Chrome","https://en-ae.namshi.com/");
	HomePage home = PageFactory.initElements(driver, HomePage.class);
	

	home.ClickMyAccountButton();
	home.frame();
	home.incorrect_credentials();
	
	
	Boolean wrong_login = home.incorrect();
	Assert.assertTrue(wrong_login);
	System.out.println("User not logged in, wrong e-mail/password");
	
	
	
	}
	
}
