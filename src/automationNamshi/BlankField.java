package automationNamshi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BlankField {

	WebDriver driver;
	
	@Test()
	public void blankFields() throws InterruptedException {
		String baseURL = "https://en-sa.namshi.com/" ;
		String hover = ".//*[@id='main_navigation']/div/ul/li[6]/a/span";
		String product = ".//*[@id='catalog_listings']/li[1]/a/div[1]/img";
		String shoppingBagButton = ".//*[@id='add_to_cart']/a/span[2]/span";
		String size = ".//*[@id='product_size']/li[1]/label";
		String proceed_checkout = ".//*[@id='proceed_to_checkout']" ;
		String email = ".//*[@id='customerEmail']";
		String password = ".//*[@id='login_password']";
		String login = ".//*[@id='login_submit']";
		
		System.setProperty("webdriver.firefox.marionette", "C:\\drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get(baseURL) ;
		WebElement web_element_to_be_hovered = driver.findElement(By.xpath(hover)) ;
		Actions builder =new Actions(driver);
		builder.moveToElement(web_element_to_be_hovered).moveToElement(driver.findElement(By.xpath(".//*[@id='main_navigation']/div/ul/li[6]/div/div/div/div[3]/ul/li[11]/a/span"))).click().build().perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath(product)).click();
		driver.findElement(By.xpath(size)).click();
		driver.findElement(By.xpath(shoppingBagButton)).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(proceed_checkout)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(email)).sendKeys("kharbanda.aishwarya+test01@tftus.com");
		driver.findElement(By.xpath(password)).sendKeys("123456");
		driver.findElement(By.xpath(login)).click();
	}
	
	
	
	
}
