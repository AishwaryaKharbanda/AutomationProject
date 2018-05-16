package com.Namshi.Pages;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Helper.BrowserFactory;

public class HomePage {

	
	WebDriver driver;
	
	@FindBy(how=How.CLASS_NAME,using="site-header__account")
	WebElement my_account_button;
	
	@FindBy(how=How.XPATH, using ="//*[@id=\"login\"]/div[1]/div/form/div[1]/input")
	WebElement email ;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login\"]/div[1]/div/form/div[2]/input") 
	WebElement password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='login']/div/div/form/button")
	WebElement submit_button;
	
	@FindBy(how=How.XPATH,using="//*[@id='login']/div[1]/div/div[3]/a")
	WebElement register;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[1]/input")
	WebElement first_name;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[2]/input")
	WebElement last_name;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[3]/input")
	WebElement email_SignUp;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[4]/input")
	WebElement pass_SignUp;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[5]/input")
	WebElement repeat_pass_SignUp;

	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[6]/select")
	WebElement gender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/button")
	WebElement register_submitButton;
	
	@FindBy(how=How.XPATH,using="//*[@id='register']/div[1]/div/form")
	WebElement existingMail_message;
	
	@FindBy(how=How.XPATH,using="//*[@id='register']/div[1]/div/form/div[4]/p")
	WebElement length_pass;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[1]/p")
	WebElement firstName_blank;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[2]/p")
	WebElement lastName_blankenter;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[3]/p")
	WebElement enter_email;
	
	@FindBy(how=How.XPATH,using="//*[@id=\\\"register\\\"]/div[1]/div/form/div[4]/p")
	WebElement enter_pass;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"register\"]/div[1]/div/form/div[6]/p")
	WebElement select_gender;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"women_link\"]/span")
	WebElement new_arrivals_hover;
	
	@FindBy(how=How.XPATH,using ="//*[@id=\"main_navigation\"]/div/ul/li[1]/div/div/div/div[1]/ul/li[2]/a/span")
	WebElement select_clothing_afterHover;
	
	@FindBy(how=How.XPATH,using=".//*[@id='wrapper']/div[2]/div[2]/div[3]/a[1]/svg/path")
	WebElement wishlist_button;
	
	@FindBy(how=How.XPATH,using=".//*[@id='cart_link']/svg")
	WebElement bag_button;
	
	@FindBy(how=How.CLASS_NAME, using="site-header__country-switcher.closed")
	WebElement hover_country;
	
	@FindBy(how=How.XPATH, using=".//*[@id='main_navigation']/div/ul/li[7]/a/span")
	WebElement hover_Premium;
	
	@FindBy(how=How.XPATH, using=".//*[@id='main_navigation']/div/ul/li[7]/a/span")
	WebElement premiumCategory;
	
	@FindBy(how=How.XPATH, using="//*[@id=\"userAuthIframe\"]")
	WebElement loginframe;
	
	@FindBy(how=How.XPATH,using="//*[@id=\"login\"]/div[1]/div/form/div[1]/p")
	WebElement invalidEmailAddress;
	
	@FindBy(how=How.XPATH,using="//*[@id='login']/div[1]/div/div[3]")
	WebElement wrong_credentials;
	
	public HomePage(WebDriver driver) 
	{
		this.driver= driver;
	}
	
	public void ClickMyAccountButton() 
	{
	my_account_button.click();
	}
	
	public void frame()
	{
	driver.switchTo().frame(loginframe);
	}
	
	public void incorrect_credentials()
	{
		
	email.sendKeys("kharbanda.aishwarya+test668810282@tftus.com");
	password.sendKeys("123456");
	submit_button.click();
	}
	
	public void signIn_user()
	{
		
	email.sendKeys("kharbanda.aishwarya+test01@tftus.com");
	password.sendKeys("123456");
	submit_button.click();
	}
	
	public void blankField()
	{
		email.sendKeys(" ");
		password.sendKeys(" ");
		submit_button.click();
	}
	
	public void sign_up() 
	{
		
		register.click();
		first_name.sendKeys("Aishwarya");
		last_name.sendKeys("Kharbanda");
		email_SignUp.sendKeys("kharbanda.aishwarya+test963359149@tftus.com");
		pass_SignUp.sendKeys("123456");
		repeat_pass_SignUp.sendKeys("123456");
		Select dropdown = new Select(gender);
			dropdown.selectByVisibleText("Female");
		
			register_submitButton.click();
	}
	
	public void existingUser_sign_up() 
	{
		
		register.click();
		first_name.sendKeys("Aishwarya");
		last_name.sendKeys("Kharbanda");
		email_SignUp.sendKeys("kharbanda.aishwarya+test01@tftus.com");
		pass_SignUp.sendKeys("123456");
		repeat_pass_SignUp.sendKeys("123456");
		Select dropdown = new Select(gender);
		dropdown.selectByVisibleText("Female");
		
			register_submitButton.click();
	}
	
	public void incorrect_pass_length() 
	{
		
		register.click();
		first_name.sendKeys("Aishwarya");
		last_name.sendKeys("Kharbanda");
		email_SignUp.sendKeys("kharbanda.aishwarya+test01@tftus.com");
		pass_SignUp.sendKeys("123");
		repeat_pass_SignUp.sendKeys("123");
		Select dropdown = new Select(gender);
		dropdown.selectByVisibleText("Female");
	}
	
	public void blankDetails_SignUpPage() 
	{
		
		register.click();
		register_submitButton.click();
	}
	public void click_Premium()
	{
		premiumCategory.click();
	}
	
	public void hoverCountry()
	{
		premiumCategory.click();	
	}
	
	  	
	public void go_to_Bag()
	{
	bag_button.click();	
	}
	
	public void Click_WishlistButton()
	{
		wishlist_button.click();	
	}
	
	public void selectCategory_afterHover() throws Exception
	{		
		WebElement web_element_to_be_hovered = new_arrivals_hover	;
		Actions builder = new Actions(driver);
		builder.moveToElement(web_element_to_be_hovered).moveToElement(select_clothing_afterHover).click().build().perform() ;
	}

	
public Boolean invalidEmail()
{
	return invalidEmailAddress.isDisplayed();
}

public Boolean incorrect()
{
	return  wrong_credentials.isDisplayed();
}

public Boolean existingEmail_message()
{
	return  existingMail_message.isDisplayed();
}

public Boolean passCriteria()
{
	return length_pass.isDisplayed();
}

public Boolean Blankdetails_SignUpUser() 
{
	 if(firstName_blank.isDisplayed()&&lastName_blankenter.isDisplayed()&&enter_email.isDisplayed()&&length_pass.isDisplayed()&&select_gender.isDisplayed())
	 {
		 return true;
	 }
	 else
			 {
		 return false;
			 }
}
	 public Boolean logged_user()
	 {
		 return my_account_button.isDisplayed();
	 }
	
}
