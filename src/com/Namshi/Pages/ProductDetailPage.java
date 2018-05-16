package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProductDetailPage {

	WebDriver driver;
	@FindBy(how=How.XPATH,using=".//*[@id='product_size']/li[2]/label")
	WebElement select_size;
	
	@FindBy(how=How.XPATH, using=".//*[@id='add_to_cart']/a/span[2]")
	WebElement add_to_bag_button;
	
	@FindBy(how=How.XPATH, using=".//*[@id='product_size']/li/label")
	WebElement size_after_filterBrand;
		
	
	public ProductDetailPage(WebDriver ldriver)
	{
		this.driver=ldriver;
	
	}
	
	public void add_To_Bag()
	{
		select_size.click();
		add_to_bag_button.click();
	}
	
	public void size_then_AddToBag()
	{
		size_after_filterBrand.click();
		add_to_bag_button.click();
	}

}
