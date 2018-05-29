package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.HomePage;
import Helper.BrowserFactory;

public class Password_Length_SignUp {
 WebDriver driver;
 @BeforeTest
 public void setup() {
  driver = BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");
 }
 
 @Test(description = "SignUp with password length less than default")
 public void password_length() {
  HomePage home = PageFactory.initElements(driver, HomePage.class);

  home.ClickMyAccountButton();
  home.frame();
  home.incorrect_pass_length();

  Boolean password_criteria = home.passCriteria();
  Assert.assertTrue(password_criteria);
  System.out.println("Password should have 6 characters");
 }
 
 @AfterTest
 public void teardown() {
  driver.quit();
 }
}