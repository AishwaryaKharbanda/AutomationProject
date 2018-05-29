package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.HomePage;
import Helper.BrowserFactory;

public class LoginError_blankFields {
 WebDriver driver;

 @BeforeTest
 public void setup() {
  driver = BrowserFactory.start_Browser("Chrome","https://en-ae.namshi.com/");
 }
 
 @Test()
 public void loginError() throws Exception {
  HomePage home_namshi = PageFactory.initElements(driver, HomePage.class);
  home_namshi.ClickMyAccountButton();
  home_namshi.frame();
  home_namshi.blankField();

  Boolean blank_fields = home_namshi.invalidEmail();
  Assert.assertTrue(blank_fields);
  System.out.println("Invalid e-mail and password");
 }
 
 @AfterTest
 public void teardown() {
  driver.quit();
 }
}