package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Order_Completed_Page {

 WebDriver driver;
 
 @FindBy(how = How.XPATH, using = ".//*[@id='checkout_success_container']/header/h1")
 WebElement orderSuccess;

 public Order_Completed_Page(WebDriver driver) {
  this.driver = driver;
 }

 public boolean display_OrderSuccess() {
  return orderSuccess.isDisplayed();
 }
}