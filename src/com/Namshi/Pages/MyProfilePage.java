package com.Namshi.Pages;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MyProfilePage {

	WebDriver driver;
	
	@FindBy(how=How.XPATH,using=".//*[@id='shop_link']/a")
	WebElement continueShopping;
	public MyProfilePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public Boolean displaycontinueShoppingButton()
	{
		 return continueShopping.isDisplayed();
	}
	

}
