package com.Namshi.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewLoginPage {
    WebDriver driver;
	@FindBy(xpath=".//*[@id='content']/div/div/section/div/form/div[1]/div/div/input")
	WebElement email ;                          //To identify the webelement. This statement means find an element where id is ""
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/section/div/form/div[2]/div/div/input") 
	WebElement password;
	//To take dynamically using the librariess we use HOW, using is a variable
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/section/div/form/div[3]/div/div/button")
	WebElement submit_button;
	
	@FindBy(how=How.XPATH,using=".//*[@id='forgot_password']")
	WebElement forgot_password_link;
	
	@FindBy(how=How.XPATH,using=".//*[@id='menu_createNewAccount']/a")
	WebElement create_account_button;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/section/div/form/div[1]/div/div/div/p[1]")
	WebElement enter_email_error;
	
	@FindBy(how=How.XPATH,using=".//*[@id='content']/div/div/section/div/form/div[2]/div/div/p[2]")
	WebElement enter_pass_error;
	
	
	public NewLoginPage(WebDriver ldriver) {                            	//this constructor will accept webdriver as an argument,so whatever driver we will recieve it will directly pass
		this.driver=ldriver;                                       		 	//this driver will come from page factory,so whatever driver will come from page factory,we will initialise to the local driver
	}

	public void login_user(String uid,String pass) {
		email.sendKeys(uid);
		password.sendKeys(pass);
		submit_button.click();
	}
		
	public Boolean login_error() 
		{
			 if(enter_email_error.isDisplayed()&&enter_pass_error.isDisplayed())
			 {
				 return true;
			 }
			 else
					 {
				 return false;
					 }
			
		}
	
	
	public void create_account()
	{
		create_account_button.click();
	}
	
	public boolean forgot_pass()
	{
		return forgot_password_link.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
