package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Wishlist_Page {
 WebDriver driver;

 @FindBy(how = How.ID, using = "33/4683/v1")
 WebElement product1_added;
 @FindBy(how = How.ID, using = "97/2283/v1")
 WebElement product2_added;
 @FindBy(how = How.XPATH, using = "//*[@id='wishList']/div/div[1]/span[1]")
 WebElement wishlist_title;

 public Wishlist_Page(WebDriver driver) {
  this.driver = driver;
 }

 public boolean products_added() {
  return wishlist_title.isDisplayed();
 }
}