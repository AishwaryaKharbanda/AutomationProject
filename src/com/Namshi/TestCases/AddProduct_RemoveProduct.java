package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.Namshi.Pages.CatalogScreenPage;
import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.ProductDetailPage;
import com.Namshi.Pages.ShoppingBagPage;

import Helper.BrowserFactory;

public class AddProduct_RemoveProduct {
 WebDriver driver;
 @BeforeTest
 public void setup() {
  driver = BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");
 }
 
 @Test(description = "Adding product in cart")
 public void addInCart() throws Exception {
  HomePage home = PageFactory.initElements(driver, HomePage.class);
  CatalogScreenPage catalog = PageFactory.initElements(driver, CatalogScreenPage.class);
  ProductDetailPage pdp = PageFactory.initElements(driver, ProductDetailPage.class);
  ShoppingBagPage bag = PageFactory.initElements(driver, ShoppingBagPage.class);

  home.selectCategory_afterHover();
  catalog.select_product();
  pdp.add_To_Bag();

  Boolean added_to_cart = bag.continueShopping();
  Assert.assertTrue(added_to_cart);
  System.out.println("Product added successfully.");
 }
 
 @Test(description = "Removing the product from cart")
 public void removeProduct() {
  ShoppingBagPage bag = PageFactory.initElements(driver, ShoppingBagPage.class);

  bag.remove_fromBag();
  Boolean product_removed = bag.cart_empty();
  Assert.assertTrue(product_removed);
  System.out.println("Product is removed from the cart");
 }
 
 @AfterClass
 public void teardown() {
  driver.quit();
 }
}