package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.HomePage;
import Helper.BrowserFactory;

public class SignUp_using_ExistingCredentials {
 WebDriver driver;
 @BeforeTest
 public void setup() {
  driver = BrowserFactory.start_Browser("Chrome","https://en-ae.namshi.com/");
 }
 
 @Test(description="Test whether it Sign's Up using existing E-mail ID")
 public void existingEmail_onSignUp() {
  HomePage home = PageFactory.initElements(driver,HomePage.class);
  home.ClickMyAccountButton();
  home.frame();
  home.existingUser_sign_up();

  Boolean existingEmail = home.existingEmailMessage();
  Assert.assertTrue(existingEmail);
  System.out.println("You are using an existing E-mail ID");
 }
 
 @AfterTest
 public void teardown() {
  driver.quit();
 }
}