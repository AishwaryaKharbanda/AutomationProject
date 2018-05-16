package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Namshi.Pages.HomePage;

import Helper.BrowserFactory;

public class Password_Length_SignUp 
{

	@Test(description= "Test if Namshi register's user with password length less than 6 characters")
	public void password_length()
	{
		WebDriver driver= BrowserFactory.start_Browser("Chrome","https://en-ae.namshi.com/");
		HomePage home=PageFactory.initElements(driver, HomePage.class);
	
		home.ClickMyAccountButton();
		home.frame();
		home.incorrect_pass_length();
	
		Boolean password_criteria=home.passCriteria();
		Assert.assertTrue(password_criteria);
		System.out.println("Password should have 6 characters");
	}

}
