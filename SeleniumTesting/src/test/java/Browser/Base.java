package Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {

	
	/*public static WebDriver openChromeBrowser() 
	{	
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\New folder\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		return driver;
	}
	public static WebDriver openFirefoxDriver() 
	{
		
		System.setProperty("weedriver.gecko.driver", "F:\\Velocity Class\\Selenium\\New folder\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		return driver;
	}
	public static WebDriver openInternetExplorerDriver() 
	{
		System.setProperty("weedriver.gecko.driver", "F:\\Velocity Class\\Selenium\\WeDriver Version\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();
		return driver;
	}*/
	
	public static WebDriver openChromeDriverr()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\New folder\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		return null;
	}
	
	public static WebDriver openFirefoxDriver()
	{
		System.setProperty("weedriver.gecko.driver", "F:\\Velocity Class\\Selenium\\New folder\\geckodriver.exe");
		WebDriver driver =new ChromeDriver();
		return null;
		
	}
	
	public static WebDriver openInternetExplorerDriver()
	{
		
		System.setProperty("weedriver.gecko.driver", "F:\\Velocity Class\\Selenium\\New folder\\geckodriver.exe");
		WebDriver driver =new ChromeDriver();
		return null;
		
	}
}

























