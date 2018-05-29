package com.Namshi.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CatalogScreenPage {

 WebDriver driver;

 @FindBy(how = How.CLASS_NAME, using = "site-header__wishlist")
 WebElement wishlist_button;

 @FindBy(how = How.XPATH, using = ".//*[@id='catalog_listings']/li[1]/a/div[1]/img")
 WebElement first_product_select;

 @FindBy(how = How.XPATH, using = ".//*[@id='catalog_listings']/li[1]/div[1]/button")
 WebElement wishlist_button1;

 @FindBy(how = How.XPATH, using = ".//*[@id='catalog_listings']/li[2]/div[1]/button")
 WebElement wishlist_button2;

 @FindBy(how = How.XPATH, using = ".//*[@id='brand_search_term']")
 WebElement brand_text_filter;

 @FindBy(how = How.XPATH, using = "//*[@id=\"catalog_filter_brand_list\"]/li[3]/a/span/input")
 WebElement checkbox_brand;

 @FindBy(how = How.XPATH, using = ".//*[@id='catalog_listings']/li[1]/a/div[1]/img")
 WebElement productSelect_afterBrandFilter;

 @FindBy(how = How.XPATH, using = ".//*[@id='catalog_listings']/li[2]/a/div[1]/img")
 WebElement second_product_select;

 public CatalogScreenPage(WebDriver driver) {
  this.driver = driver;
 }

 public void Click_WishlistButton() throws Exception {
  wishlist_button.click();
 }

 public void select_product() {
  first_product_select.click();
 }

 public void selectSecond_product() {
  second_product_select.click();
 }

 public void wishlistAdd_Catalog() {
  wishlist_button1.click();
  wishlist_button2.click();
 }

 public void brandFilter(String brand) {
  JavascriptExecutor jse = (JavascriptExecutor) driver;
  jse.executeScript("window.scrollBy(0,350)", "");
  brand_text_filter.sendKeys(brand);
  checkbox_brand.click();
  productSelect_afterBrandFilter.click();
 }
}