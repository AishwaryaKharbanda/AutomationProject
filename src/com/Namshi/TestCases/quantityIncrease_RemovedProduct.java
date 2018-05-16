package com.Namshi.TestCases;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Namshi.Pages.CatalogScreenPage;
import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.ProductDetailPage;
import com.Namshi.Pages.ShoppingBagPage;

import Helper.BrowserFactory;

public class quantityIncrease_RemovedProduct
{
	WebDriver driver= BrowserFactory.start_Browser("Chrome", "https://en-ae.namshi.com/");
	@Test(description="Increasing the quantity of product in cart")
	public void quantityInCart() throws Exception
		{
	
			HomePage home=PageFactory.initElements(driver , HomePage.class);
			CatalogScreenPage catalog = PageFactory.initElements(driver, CatalogScreenPage.class);
			ProductDetailPage pdp = PageFactory.initElements(driver, ProductDetailPage.class);
			ShoppingBagPage bag= PageFactory.initElements(driver, ShoppingBagPage.class);


			home.selectCategory_afterHover();
			catalog.select_product();
			pdp.add_To_Bag();
			bag.inc_quantity();
	 
			Boolean increasedQuantity = bag.quantity_increased();
			Assert.assertTrue(increasedQuantity);
			System.out.println("Quantity is now increased.");
	 
		}
	 @Test(description="Removing the product from cart")
	 public void removeProduct() 
	    {
	    	ShoppingBagPage bag= PageFactory.initElements(driver, ShoppingBagPage.class);
	 
	    	bag.remove_fromBag();
	    	Boolean product_removed = bag.cart_empty(); 
	    	Assert.assertTrue(product_removed);
	    	System.out.println("Product is removed from the cart");
	    }
}


