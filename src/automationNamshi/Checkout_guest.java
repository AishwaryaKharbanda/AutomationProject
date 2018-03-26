package automationNamshi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
import org.testng.annotations.Test;

public class Checkout_guest {

	WebDriver driver;
	@Test
	public void order_Success_Guest() throws InterruptedException {
		
		String baseURL = "https://en-ae.namshi.com/" ;
		String clothing = ".//*[@id='main_navigation']/div/ul/li[1]/div/div/div/div[1]/ul/li[2]/a/span";
		String hover = ".//*[@id='main_navigation']/div/ul/li[1]/a/span" ;
		String product =".//*[@id='catalog_listings']/li[1]/a/div[1]/img";
		String size = ".//*[@id='product_size']/li[3]/label" ;
		String add_to_shoppingBag = ".//*[@id='add_to_cart']/a/span[2]" ;
		String proceed_To_Checkout = ".//*[@id='proceed_to_checkout']" ;
		String guest_Email = ".//*[@id='guest_login_email']" ;
		String continue_as_guest = ".//*[@id='guest_login_submit']" ;
		String full_name = ".//*[@id='new_address_name']" ;
		String carrier_Code = ".//*[@id='new_address_carrier_code']" ;
		String number = ".//*[@id='new_address_number']";
		String address = ".//*[@id='new_address_address']";
		String city = ".//*[@id='new_address_city']";
		String proceed_to_payment = ".//*[@id='new_address_submit']" ;
		String cash_On_Delivery_button = ".//*[@id='payment_method_cod']" ;
		String buy_Now = ".//*[@id='payment_submit_top']";
				
				
				System.setProperty("webdriver.firefox.marionette", "C:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		
		driver.get(baseURL) ;
		WebElement web_element_to_be_hovered = driver.findElement(By.xpath(hover))	;
		Actions builder = new Actions(driver);
		builder.moveToElement(web_element_to_be_hovered).moveToElement(driver.findElement(By.xpath(clothing))).click().build().perform() ;
		driver.findElement(By.xpath(product)).click();
		driver.findElement(By.xpath(size)).click();
		driver.findElement(By.xpath(add_to_shoppingBag)).click();
		driver.findElement(By.xpath(proceed_To_Checkout)).click();
		driver.findElement(By.xpath(guest_Email)).sendKeys("kharbanda.aishwarya+test006699@tftus.com");
		driver.findElement(By.xpath(continue_as_guest)).click();
		driver.findElement(By.xpath(full_name)).sendKeys("kharbanda aishwarya");
		Select dropdown = new Select(driver.findElement(By.xpath(carrier_Code)));
		dropdown.selectByIndex(1);
		driver.findElement(By.xpath(number)).sendKeys("1234567");
		driver.findElement(By.xpath(address)).sendKeys("TFT");
		driver.findElement(By.xpath(city)).sendKeys("TFT");
		driver.findElement(By.xpath(proceed_to_payment)).click();
		driver.findElement(By.xpath(cash_On_Delivery_button)).click();
		driver.findElement(By.xpath(buy_Now)).click();
//	Boolean guest_checkout_succesful = driver.findElement(By.xpath(".//*[@id='verify_phone_form_container']/p")).isDisplayed();
//		Assert.assertTrue(guest_checkout_succesful);
			
		Alert alert = driver.switchTo().alert();
		String alertMessage= driver.switchTo().alert().getText();
		System.out.println(alertMessage);	
		        Thread.sleep(5000);
		alert.accept();

		
		driver.quit();
	}
	
	
	
	
}
