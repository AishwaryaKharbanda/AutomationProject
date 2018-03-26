package automationNamshi;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class SelectCountry {
	
	WebDriver driver ;
	
	@Test(description= "Country is selected")
	public void select() { 
		
		String path=".//*[@id='splash_container']/div/ul/li[1]/a[3]";
		
		System.setProperty("webdriver.firefox.marionette", "C:\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.namshi.com/");
		driver.findElement(By.xpath(path)).click();
	    driver.quit();
		 
		
	}
	

}
