package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PremiumShopPage {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div[2]/div/a/div[1]/img")
	WebElement first_premium_Banner;


	public PremiumShopPage(WebDriver ldriver)
	{
		this.driver= ldriver;
	}
	public void click_first_banner()
		{
			first_premium_Banner.click();
		}




}
