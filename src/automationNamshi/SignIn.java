
package automationNamshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignIn {
	
	WebDriver driver;
    @Test()
	public void login() throws InterruptedException {
    	String UAEcountry = ".//*[@id='splash_container']/div/ul/li[1]/a[3]" ;
    	String myAccount = ".//*[@id='site_header']/div/div[1]/ul[3]/li/ul/li/a" ;
	    String startLogin = ".//*[@id='menu_Login']/a" ;
	    String email= ".//*[@id='content']/div/div/section/div/form/div[1]/div/div/input" ;
	    String password =".//*[@id='content']/div/div/section/div/form/div[2]/div/div/input" ;
        String loginButton = ".//*[@id='content']/div/div/section/div/form/div[3]/div/div/button" ;	
	
	System.setProperty("webdriver.firefox.marionette", "C:\\drivers\\geckodriver.exe");
	driver = new FirefoxDriver();
	driver.get("https://www.namshi.com/");
	
	driver.findElement(By.xpath(UAEcountry)).click();
	driver.findElement(By.xpath(myAccount)).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(startLogin)).click();
//	Thread.sleep(3000);
	driver.findElement(By.xpath(email)).sendKeys("kharbanda.aishwarya+test01@tftus.com");
	driver.findElement(By.xpath(password)).sendKeys("123456");
	driver.findElement(By.xpath(loginButton)).click();
	Thread.sleep(3000);
	Boolean loginSuccess = driver.findElement(By.xpath(".//*[@id='menu_myOrders']/a")).isDisplayed();
Assert.assertTrue(loginSuccess);
System.out.println("complete");

}
	
	

}
