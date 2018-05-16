package com.Namshi.TestCases;

import org.openqa.selenium.WebDriver;

//import static org.testng.Assert.assertTrue;

//import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Namshi.Pages.AddressPage;
import com.Namshi.Pages.CatalogScreenPage;
import com.Namshi.Pages.HomePage;
import com.Namshi.Pages.Order_Completed_Page;
import com.Namshi.Pages.PaymentPage;
import com.Namshi.Pages.ProductDetailPage;
import com.Namshi.Pages.ShoppingBagPage;
//import com.Namshi.Pages.SignIn_Guest_while_Checkout;
import com.Namshi.Pages.SignIn_Guest_while_Checkout_page;

import Helper.BrowserFactory;

public class OrderPlacedSuccessfully 
{

	@Test(description="Place Order")
	public void place_order() throws Exception 
	{
	 
	 WebDriver driver=BrowserFactory.start_Browser("Chrome","https://en-ae.namshi.com/");
	 HomePage home=PageFactory.initElements(driver , HomePage.class);
	 CatalogScreenPage catalog = PageFactory.initElements(driver, CatalogScreenPage.class);
	 ProductDetailPage pdp = PageFactory.initElements(driver, ProductDetailPage.class);
	 ShoppingBagPage bag= PageFactory.initElements(driver, ShoppingBagPage.class);
	 SignIn_Guest_while_Checkout_page login = PageFactory.initElements(driver, SignIn_Guest_while_Checkout_page.class);
	 AddressPage scrollDown= PageFactory.initElements(driver, AddressPage.class);
	 PaymentPage cod= PageFactory.initElements(driver,PaymentPage.class);
	 Order_Completed_Page order_complete= PageFactory.initElements(driver, Order_Completed_Page.class);
	 
	 home.selectCategory_afterHover();
	 catalog.select_product();
	 pdp.add_To_Bag();
	 bag.checkout_button();
	 login.login_checkout("kharbanda.aishwarya+test01@tftus.com","123456");
	 scrollDown.scrollDownPage();
	 scrollDown.payment_button();
	 cod.cod_payment();
	 
	 Boolean order_success= order_complete.display_OrderSuccess();
	 Assert.assertTrue(order_success);
	 System.out.println("Order placed successfully");
	}
}
