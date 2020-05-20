package Muthanjay;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Library
{

	public static WebDriver launchChrome()
	{
		System.setProperty("webdriver.chrome.driver", "/Users/monika/Downloads/chromedriver4");
		WebDriver driver = new ChromeDriver();
		return driver;	
	}
	
	public static WebDriver launchChrome(String url)
	{
		//System.setProperty("webdriver.chrome.driver", "/Users/monika/Downloads/chromedriver 3");
		WebDriverManager.chromedriver().setup();
		// driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "/Users/monika/Downloads/geckodriverLatest");
		WebDriver driver = new ChromeDriver();		
		driver.get(url);
		return driver;	
	}
	
	
	public static WebDriver launchChromeRemote(String url) throws MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "/Users/monika/Downloads/chromedriver4");
		DesiredCapabilities capability = DesiredCapabilities.chrome();			
		WebDriver temp = new RemoteWebDriver(new URL("http://192.168.1.19:4444/wd/hub"), capability);	
		temp.get(url);
		return temp;	
	}
	
	public static void clearAndTypeValue(WebElement element,String value)
	{
		element.clear();
		element.sendKeys(value);
		
	}
	
}
