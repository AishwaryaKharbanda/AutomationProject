
package automationNamshi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUp  {
WebDriver driver;
	

@Test(description="Sign Up Successful")
public void newUser() throws InterruptedException {
		String UAEcountry = ".//*[@id='splash_container']/div/ul/li[1]/a[3]" ;
		String myAccount = ".//*[@id='site_header']/div/div[1]/ul[3]/li/ul/li/a" ;
        String createNewAccount = ".//*[@id='menu_createNewAccount']/a" ;
		String firstName = ".//*[@id='data-firstName']" ;
		String lastName = ".//*[@id='data-lastName']" ;
		String email = ".//*[@id='data-email']" ;
		String password = ".//*[@id='data-password']" ;
		String repeatPassword = ".//*[@id='data-passwordMatch']" ;
		String gender = ".//*[@id='data-gender']" ;
		String bday =".//*[@id='data-birthday']" ;		
		String save = ".//*[@id='register_submit']" ;		
		
		
		System.setProperty("webdriver.firefox.marionette", "C:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.namshi.com/");
		driver.findElement(By.xpath(UAEcountry)).click();
		driver.findElement(By.xpath(myAccount)).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(createNewAccount)).click();
		driver.findElement(By.xpath(firstName)).sendKeys("Aishwarya");
		driver.findElement(By.xpath(lastName)).sendKeys("Kharbanda");
		driver.findElement(By.xpath(email)).sendKeys("Kharbanda.aishwarya+test0115944@tftus.com");
		driver.findElement(By.xpath(password)).sendKeys("123456");
		driver.findElement(By.xpath(repeatPassword)).sendKeys("123456");
	
		Select dropdown = new Select(driver.findElement(By.xpath(gender)));
		dropdown.selectByVisibleText("Female");
		driver.findElement(By.xpath(bday)).sendKeys("05/08/1994");
		driver.findElement(By.xpath(save)).click();
		Thread.sleep(3000);
		Boolean signUpDone = driver.findElement(By.xpath(".//*[@id='menu_myOrders']/a")).isDisplayed() ;
		Assert.assertTrue(signUpDone);
		
}
	}

