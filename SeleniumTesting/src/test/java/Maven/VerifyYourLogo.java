package Maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import Browser.Base;
import YourLogo.LoginPage;
import YourLogo.MyAccount;
import YourLogo.Tshirt;

public class VerifyYourLogo {
	WebDriver driver;
	MyAccount myaccount;
	LoginPage loginpage;
	
	
	@Parameters("browserName")
	@BeforeTest
	private void lounchbrowser(String browser)
	{
		System.out.println(browser);
		if(browser.equals("Chrome"));
		{
			driver=Base.openChromeDriverr();
		}
		if(browser.equals("Firefox"))
		{
			driver=Base.openFirefoxDriver();
		}
		if(browser.equals("Internet Explorer"))
		{
			driver=Base.openInternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	
	@BeforeClass
	private void lounchBrowser()
	{
		/*System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\Selenium\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();*/
		loginpage =new LoginPage(driver);
		 myaccount=new MyAccount(driver);


		
	}
	@BeforeMethod
	private void logintoApplication()
	{
		driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
		loginpage.sendtoemial();
		loginpage.sendtopassword();
		loginpage.clickonsignin();
		
		}
	
	@Test
	public void myaccount()
	{
		
		myaccount.clickontshirt();
	}
	
	@AfterMethod
	private void homepage()
	{
		Tshirt tshirt =new Tshirt(driver);
		tshirt.clickonaddtocart();
	}
	
	@AfterClass
	private void  eraseobject()
	{
		loginpage=null;
		myaccount=null;
	}
	@AfterTest
	public void  closeddriver()
	{
		driver.close();
		driver=null;
		System.gc();
	}
}

































