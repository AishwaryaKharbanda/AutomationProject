package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn_Guest_while_Checkout_page {
 WebDriver driver;

 @FindBy(how = How.XPATH, using = ".//*[@id='customerEmail']")
 WebElement email_whileCheckout;
 @FindBy(how = How.XPATH, using = ".//*[@id='login_password']")
 WebElement password_whileCheckout;
 @FindBy(how = How.XPATH, using = ".//*[@id='login_submit']")
 WebElement login_whileCheckout;

 public SignIn_Guest_while_Checkout_page(WebDriver driver) {
  this.driver = driver;
 }

 public void login_checkout(String uid, String pass) {
  email_whileCheckout.sendKeys(uid);
  password_whileCheckout.sendKeys(pass);
  login_whileCheckout.click();
 }
}