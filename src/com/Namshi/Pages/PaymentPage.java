package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class PaymentPage {

WebDriver driver;

@FindBy(how=How.ID,using="payment_method_cod")
WebElement cod_radio_button;

@FindBy(how=How.ID,using="payment_submit_top")
WebElement buy;

@FindBy(how=How.XPATH,using=".//*[@id='cod_container']/div/label/span")
WebElement limit_exceed_cod;
public PaymentPage(WebDriver ldriver)
{
	this.driver=ldriver;
}

public void cod_payment() throws Exception
{
WebElement radioBtn = cod_radio_button;
 radioBtn.click();
 Thread.sleep(5000);
 buy.click();
}

public boolean cod_limit_exceeded()
{
	return limit_exceed_cod.isDisplayed();
}
}
