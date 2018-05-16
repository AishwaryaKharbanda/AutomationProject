package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PremiumCatalogPage {
WebDriver driver;
	
	@FindBy(how=How.XPATH,using=".//*[@id='catalog_listings']/li[2]/a/div[1]/img")
	WebElement second_premium_product;

	@FindBy(how=How.XPATH,using=".//*[@id='catalog_listings']/li[3]/a/div[1]/img")
	WebElement third_premium_product;
	
	@FindBy(how=How.XPATH,using=".//*[@id='catalog_listings']/li[1]/a/div[1]/img")
	WebElement first_premium_product;


	public PremiumCatalogPage(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	
	public void click_second_product()
	{
		second_premium_product.click();
		}

	public void click_third_product()
	{
	third_premium_product.click();
	}
	public void click_first_product()
	{
	first_premium_product.click();
	}

}
