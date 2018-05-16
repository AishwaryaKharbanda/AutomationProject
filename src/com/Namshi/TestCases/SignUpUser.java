package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.MyProfilePage;

import Helper.BrowserFactory;

public class SignUpUser
{
	@Test(description="Sign Up user in Namshi")
	public void signUp_Namshi() 
	{
		WebDriver driver = BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");
		HomePage home=PageFactory.initElements(driver, HomePage.class);
		MyProfilePage profile= PageFactory.initElements(driver, MyProfilePage.class);
		
		home.ClickMyAccountButton();
		home.frame();
		home.sign_up();
		
		Boolean signUp_Success =profile.displaycontinueShoppingButton();
		Assert.assertTrue(signUp_Success);
		System.out.println("Test Passed: Signed Up success");
	}
}
