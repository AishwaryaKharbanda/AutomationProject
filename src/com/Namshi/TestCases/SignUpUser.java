package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.MyProfilePage;

import Helper.BrowserFactory;

public class SignUpUser {
 WebDriver driver;
 @BeforeTest
 public void setup() {
  driver = BrowserFactory.start_Browser("Firefox", "https://en-ae.namshi.com/");
 }
 
 @Test(description = "Sign Up user in Namshi")
 public void signUp_Namshi() {
  HomePage home = PageFactory.initElements(driver, HomePage.class);
  MyProfilePage profile = PageFactory.initElements(driver, MyProfilePage.class);

  home.ClickMyAccountButton();
  home.frame();
  home.sign_up();

  Boolean signUp_Success = profile.displaycontinueShoppingButton();
  Assert.assertTrue(signUp_Success);
  System.out.println("Test Passed: Signed Up success");
 }
 
 @AfterTest
 public void tearDown() {
  driver.quit();
 }
}