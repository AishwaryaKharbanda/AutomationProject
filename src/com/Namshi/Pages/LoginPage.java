package com.Namshi.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
    By email= By.xpath(".//*[@id='content']/div/div/section/div/form/div[1]/div/div/input") ;
    By password = By.xpath(".//*[@id='content']/div/div/section/div/form/div[2]/div/div/input") ;
    By loginButton = By.xpath(".//*[@id='content']/div/div/section/div/form/div[3]/div/div/button") ;	
    By forgot_password = By.xpath(".//*[@id='forgot_password']") ;
    By continueShopping = By.xpath(".//*[@id='shop_link']/a") ;
    By createNewAccount = By.xpath(".//*[@id='menu_createNewAccount']/a") ;
	
	
public LoginPage(WebDriver driver)
{
	this.driver=driver;
}

public void typeUsername(String uid) {
	
driver.findElement(email).sendKeys(uid);	
}

public void loginUser(String user, String passw) {
	driver.findElement(email).sendKeys(user);
	driver.findElement(password).sendKeys(passw);
	driver.findElement(loginButton).click();
}

public void typePassword(String pass) {
	driver.findElement(password).sendKeys(pass);

}

public void clickLoginButton() {
	driver.findElement(loginButton).click();
}

}
