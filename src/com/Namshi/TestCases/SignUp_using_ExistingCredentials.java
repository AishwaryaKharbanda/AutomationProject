package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Namshi.Pages.HomePage;

import Helper.BrowserFactory;

public class SignUp_using_ExistingCredentials 
{
	@Test(description="Test whether it Sign's Up using existing E-mail ID")
	public void existingEmail_onSignUp()
	{
		WebDriver driver= BrowserFactory.start_Browser("Firefox","https://en-ae.namshi.com/");
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		
		home.ClickMyAccountButton();
		home.frame();
		home.existingUser_sign_up();
		
		Boolean existingEmail= home.existingEmail_message();
		Assert.assertTrue(existingEmail);
		System.out.println("You are using an existing E-mail ID");
	}		
}
