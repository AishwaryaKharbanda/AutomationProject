package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.HomePage;
import Helper.BrowserFactory;

public class SignIn {
 WebDriver driver;
 @BeforeTest
 public void setup() {
  driver = BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");
 }
 
 @Test(description = "Verify If user Logs In with valid credentials")
 public void login_wrong_credentials() {
  WebDriver driver = BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");
  HomePage home = PageFactory.initElements(driver, HomePage.class);
  home.ClickMyAccountButton();
  home.frame();
  home.signIn_user();

  Boolean wrong_login = home.logged_user();
  Assert.assertTrue(wrong_login);
  System.out.println("User now logged in");
 }
 
 @AfterTest
 public void teardown() {
  driver.quit();
 }
}