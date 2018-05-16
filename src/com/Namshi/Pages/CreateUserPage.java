package com.Namshi.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class CreateUserPage {

	WebDriver driver;
	
	@FindBy(how=How.XPATH,using=".//*[@id='data-firstName']")
	WebElement firstName;
	
	@FindBy(how=How.XPATH,using=".//*[@id='data-lastName']")
	WebElement lastName;
	
	@FindBy(how=How.XPATH,using=".//*[@id='data-email']")
	WebElement email;

	@FindBy(how=How.ID,using="data-password")
	WebElement password;

	@FindBy(how=How.XPATH,using=".//*[@id='data-passwordMatch']")
	WebElement repeat_password;
	
	@FindBy(how=How.XPATH,using=".//*[@id='data-gender']")
	WebElement gender;
	
	@FindBy(how=How.XPATH,using=".//*[@id='data-birthday']")
	WebElement bday;
	
	@FindBy(how=How.XPATH,using=".//*[@id='register_submit']")
	WebElement save_SignUp;
	
	@FindBy(how=How.XPATH,using=".//*[@id='notification_bar']/div/ul/li/p")
	WebElement message_existingMail;
	
	public CreateUserPage(WebDriver ldriver) 
		{
			this.driver=ldriver;
		}
	
	public void sign_up() 
	{
		
		firstName.sendKeys("Aishwarya");
		lastName.sendKeys("Kharbanda");
		email.sendKeys("kharbanda.aishwarya+test963149@tftus.com");
		password.sendKeys("123456");
		repeat_password.sendKeys("123456");
		Select dropdown = new Select(gender);
			dropdown.selectByVisibleText("Female");
		bday.sendKeys("05/08/1994");
		save_SignUp.click();
	}
	
	public void sign_up_existingID() 
	{
		
		firstName.sendKeys("Aishwarya");
		lastName.sendKeys("Kharbanda");
		email.sendKeys("kharbanda.aishwarya+test01@tftus.com");
		password.sendKeys("123456");
		repeat_password.sendKeys("123456");
		Select dropdown = new Select(gender);
			dropdown.selectByVisibleText("Female");
		bday.sendKeys("05/08/1994");
		save_SignUp.click();
	}
	
public boolean existingEmail_message()
{
	return message_existingMail.isDisplayed();
}

}
