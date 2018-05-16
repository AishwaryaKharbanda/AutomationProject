package com.Namshi.TestCases;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Namshi.Pages.CatalogScreenPage;
import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.ProductDetailPage;
import com.Namshi.Pages.ShoppingBagPage;

import Helper.BrowserFactory;

public class Products_Retrieved_inCart {

	WebDriver driver= BrowserFactory.start_Browser("Firefox", "https://en-ae.namshi.com/");
	
	@Test(description="After changing the country, currency gets changed accordingly")
	public void verify_products() throws Exception
	{
		
		HomePage home=PageFactory.initElements(driver , HomePage.class);
		 CatalogScreenPage catalog = PageFactory.initElements(driver, CatalogScreenPage.class);
		 ProductDetailPage pdp = PageFactory.initElements(driver, ProductDetailPage.class);
		 ShoppingBagPage bag= PageFactory.initElements(driver, ShoppingBagPage.class);

		 home.selectCategory_afterHover();
		 catalog.select_product();
		 
		 pdp.size_then_AddToBag();
         bag.country();
         bag.change_lang();
		 
        WebElement web_element_to_be_hovered = driver.findElement(By.className("site-header__country-switcher.closed"))	;
 		Actions builder = new Actions(driver);
 		builder.moveToElement(web_element_to_be_hovered).moveToElement(driver.findElement(By.className("sa.country"))).click().build().perform() ;  
	}
	
}
