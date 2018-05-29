package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.CatalogScreenPage;
import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.Wishlist_Page;
import Helper.BrowserFactory;

public class AddProducts_Wishlist {
 WebDriver driver;
 @BeforeTest
 public void setup() {
  driver=BrowserFactory.start_Browser("Chrome","https://en-ae.namshi.com/");
 }
 
 @Test(description = "Add products to wishlist")
 public void wishlist() throws Exception {
  HomePage home = PageFactory.initElements(driver, HomePage.class);
  CatalogScreenPage catalog=PageFactory.initElements(driver, CatalogScreenPage.class);
  Wishlist_Page wishlist=PageFactory.initElements(driver, Wishlist_Page.class);

  home.selectCategory_afterHover();
  catalog.wishlistAdd_Catalog();
  catalog.Click_WishlistButton();

  Boolean productsAdded_Wishlist=wishlist.products_added();
  Assert.assertTrue(productsAdded_Wishlist);
  System.out.println("Products successfully added in the wishlist");
 }
 
 @AfterTest
 public void tearDown() {
  driver.quit();
 }
}