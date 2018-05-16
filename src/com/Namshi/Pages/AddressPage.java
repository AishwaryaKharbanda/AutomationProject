package com.Namshi.Pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddressPage {
WebDriver driver;

@FindBy(how=How.XPATH,using=".//*[@id='checkout_container']/div/div/div[1]/div[2]/section/div/div[2]/form/div/button")
WebElement proceedPayment_button;

public AddressPage(WebDriver ldriver)
{
	this.driver=ldriver;
}

public void scrollDownPage()
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,350)", "");

}

public void payment_button()
{
	proceedPayment_button.click();
}

}
