package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class ShoppingBagPage {
 WebDriver driver;

 @FindBy(how = How.XPATH, using = ".//*[@id='main_navigation']/div/ul/li[1]/a/span")
 WebElement new_arrivals_hover;

 @FindBy(how = How.XPATH, using = ".//*[@id='main_navigation']/div/ul/li[1]/div/div/div/div[1]/ul/li[2]/a/span")
 WebElement select_clothing_afterHover;

 @FindBy(how = How.XPATH, using = ".//*[@id='proceed_to_checkout']")
 WebElement proceed_to_checkout_button;

 @FindBy(how = How.XPATH, using = ".//*[@id='cart_overview']/table/tbody/tr/td/table/tr[1]/td[5]/div/label/select")
 WebElement quantity;

 @FindBy(how = How.XPATH, using = ".//*[@id='cart_overview']/table/tbody/tr/td/table/tr[1]/td[5]/div/label/select")
 WebElement quantityIn_dropdown;

 @FindBy(how = How.XPATH, using = ".//*[@id='cart_overview']/table/tbody/tr/td/table/tr[2]/td/a")
 WebElement remove;

 @FindBy(how = How.XPATH, using = ".//*[@id='cart_empty_container']/a")
 WebElement return_catalog;
 @FindBy(how = How.XPATH, using = ".//*[@id='invoice_total']")
 WebElement SAR_currency;

 @FindBy(how = How.XPATH, using = ".//*[@id='wrapper']/div[2]/div[1]/div/div[4]")
 WebElement country_dropdown;

 @FindBy(how = How.XPATH, using = ".//*[@id='wrapper']/div[2]/div[1]/div/a")
 WebElement language;
 
 @FindBy(how = How.XPATH, using = "//*[@id=\"continue_shopping\"]")
 WebElement continue_shop;
 
 public void inc_quantity() {
  Select dropdown = new Select(quantity);
  dropdown.selectByIndex(2);
 }

 public ShoppingBagPage(WebDriver driver) {
  this.driver = driver;
 }

 public void checkout_button() {
  proceed_to_checkout_button.click();
 }

 public void change_lang() {
  language.click();
 }

 public void remove_fromBag() {
  remove.click();
 }
 
 public void country() {
  Select dropdown = new Select(country_dropdown);
  dropdown.selectByIndex(0);
 }

 public void selectCategory_afterHover() {
  WebElement web_element_to_be_hovered = new_arrivals_hover;
  Actions builder = new Actions(driver);
  builder.moveToElement(web_element_to_be_hovered).moveToElement(select_clothing_afterHover).click().build().perform();
 }
 
 public boolean quantity_increased() {
  Select select = new Select(quantity);
  WebElement option = select.getFirstSelectedOption();
  String defaultItem = option.getText();
  if (Integer.parseInt(defaultItem) == 3) {
   return true;
  } else {
   return false;
  }
 }

 public boolean cart_empty() {
  return return_catalog.isDisplayed();
 }
 
 public boolean continueShopping() {
	 return continue_shop.isDisplayed();
 }
}