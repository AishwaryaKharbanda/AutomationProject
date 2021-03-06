package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.HomePage;
import Helper.BrowserFactory;

public class SignUp_without_Details {
 WebDriver driver;
 @BeforeTest
 public void setup() {
  driver = BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");
 }
 
 @Test(description = "Press Submit without entering any details on Sign Up")
 public void SignUp_BlankDetails() {
  HomePage home = PageFactory.initElements(driver, HomePage.class);
  home.ClickMyAccountButton();
  home.frame();
  home.blankDetails_SignUpPage();

  Boolean blankPage_SignUp = home.Blankdetails_SignUpUser();
  Assert.assertTrue(blankPage_SignUp);
  System.out.println("User cannot Sign Up, please fill all the details.");
 }
 
 @AfterTest
 public void tearDown() {
  driver.quit();
 }
}