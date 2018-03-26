package automationNamshi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidGuestAddress {

	WebDriver driver ;
	
	@Test
	public void invalidGuestID() throws InterruptedException {
	
		String baseURL = "https://en-ae.namshi.com/" ;
		String hover = ".//*[@id='main_navigation']/div/ul/li[9]/a/span" ;
	String select_after_hover = ".//*[@id='main_navigation']/div/ul/li[9]/div/div/div/div[2]/ul/li[5]/a/span" ;
	String product = ".//*[@id='catalog_listings']/li[1]/a/div[1]/img" ;
	String shopping_Bag_button = ".//*[@id='add_to_cart']/a/span[2]/span" ;
	String proceed_checkout = ".//*[@id='proceed_to_checkout']" ;
	String guest_email = ".//*[@id='guest_login_email']" ;
	String guest_button = ".//*[@id='guest_login_submit']" ;
	
	
	System.setProperty("webdriver.firefox.marionette", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get(baseURL);
		WebElement web_element_to_be_hovered = driver.findElement(By.xpath(hover));
		Actions builder = new Actions(driver);
		builder.moveToElement(web_element_to_be_hovered).moveToElement(driver.findElement(By.xpath(select_after_hover))).click().build().perform() ;
		JavascriptExecutor jse = (JavascriptExecutor)driver;
				jse.executeScript("window.scrollBy(0,250)", "");
	driver.findElement(By.xpath(product)).click();
	driver.findElement(By.xpath(shopping_Bag_button)).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(proceed_checkout)).click();
	driver.findElement(By.xpath(guest_email)).sendKeys("aishu");
	driver.findElement(By.xpath(guest_button)).click();
	Boolean wrong_email = driver.findElement(By.xpath(".//*[@id='guest_login']/div[1]/div/div/div/p[3]")).isDisplayed();
	Assert.assertTrue(wrong_email);
	
	}
	
	
	
}



