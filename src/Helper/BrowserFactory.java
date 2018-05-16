package Helper;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {                              //It will accept the browser name in a parameter and based on ur parameter,it will trigger the respective browser

	static WebDriver driver  ;
	public static WebDriver start_Browser(String browserName,String URL) {                             //accept browser name as a parameter
		
		
		if(browserName.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.firefox.marionette","C:\\drivers\\geckodriver.exe");
			driver=new FirefoxDriver();
	}
		else if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Java_Learning\\Namshi\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			driver=new InternetExplorerDriver();
		}
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get(URL);
	return driver;
	
	}
}
