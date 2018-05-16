package com.Namshi.TestCases;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Namshi.Pages.HomePage;

import Helper.BrowserFactory;

public class LoginError_blankFields {

	@Test()
	public void loginError() throws Exception 
	{
		WebDriver driver= BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");

		HomePage home_namshi = PageFactory.initElements(driver, HomePage.class);
		
		home_namshi.ClickMyAccountButton();
		home_namshi.frame();
		home_namshi.blankField();
		
		Boolean blank_fields= home_namshi.invalidEmail();
		Assert.assertTrue(blank_fields);
		System.out.println("Invalid e-mail and password");
	}
	}
