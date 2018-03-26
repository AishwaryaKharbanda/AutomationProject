package automationNamshi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Coupon {

	WebDriver driver ;
	
	@Test
	public void couponCode() throws InterruptedException {

	    String email = ".//*[@id='customerEmail']" ;		
	    String password = ".//*[@id='login_password']";
		String loginButton = ".//*[@id='login_submit']" ;
	
		String bags = ".//*[@id='main_navigation']/div/ul/li[1]/div/div/div/div[2]/ul/li[5]/a/span" ;
		String product =".//*[@id='catalog_listings']/li[1]/a/div[1]/img";
		String shopping_bag = ".//*[@id='add_to_cart']/a/span[2]/span" ;
		String proceed_checkout = ".//*[@id='proceed_to_checkout']" ;
		String cod =".//*[@id='payment_method_cod']" ;
		String couponCode =".//*[@id='coupon_code']";
		String validateCoupon = ".//*[@id='coupon_submit']" ;
		String proceed_to_payment = ".//*[@id='checkout_container']/div/div/div[1]/div[2]/section/div/div[2]/form/div/button" ;
		
		System.setProperty("webdriver.firefox.marionette", "C:\\drivers\\geckodriver.exe");
				driver=new FirefoxDriver();
		driver.get("https://en-ae.namshi.com/");
	
		WebElement web_Element_To_Be_Hovered = driver.findElement(By.xpath(".//*[@id='main_navigation']/div/ul/li[1]/a/span"));
		Actions builder = new Actions(driver);
	    builder.moveToElement(web_Element_To_Be_Hovered).moveToElement(driver.findElement(By.xpath(bags))).click().build().perform();
	    JavascriptExecutor jse = (JavascriptExecutor)driver;
	    jse.executeScript("scroll(0, 250);");
		
		driver.findElement(By.xpath(product)).click();
		driver.findElement(By.xpath(shopping_bag)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(proceed_checkout)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(email)).sendKeys("kharbanda.aishwarya+test01@tftus.com");
        driver.findElement(By.xpath(password)).sendKeys("123456");
        driver.findElement(By.xpath(loginButton)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(proceed_to_payment)).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(cod)).click();
        driver.findElement(By.xpath(couponCode)).sendKeys("TESTWEBONLY");
        Thread.sleep(3000);
        driver.findElement(By.xpath(validateCoupon)).click();	
        Thread.sleep(3000);
        Boolean couponApplied = driver.findElement(By.xpath(".//*[@id='coupon_delete']")).isDisplayed();
	Assert.assertTrue(couponApplied);

	}

	
	
}
