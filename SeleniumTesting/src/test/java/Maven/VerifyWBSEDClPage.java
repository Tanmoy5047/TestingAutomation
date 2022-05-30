package Maven;



import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Browser.Base;
import Utils.Utility;
import WBSEDCL.ApplicationHeader;
import WBSEDCL.HomePage;

public class VerifyWBSEDClPage {
	WebDriver driver;
	ApplicationHeader applicationHeader;
	HomePage homepage;
	SoftAssert soft;
	
	@Parameters("browser")
	@BeforeTest
	private void lounchbrowser(String browser)
	{
		System.out.println(browser);
		if(browser.equals("chrome"))
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
	private void createPOMObject()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Velocity Class\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		
		applicationHeader=new ApplicationHeader(driver);
		homepage=new HomePage(driver);
		soft=new SoftAssert();


	}
	
	
	@BeforeMethod
	private void movetoApplicationHeader()
	{
		driver.get("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Home.html");
		
		applicationHeader.movetoapplicationHeader();
		applicationHeader.movetoconnectionmanagement();
		
		
	}
	
	
	//1st Test Case
	@Test(priority=3)
	public void verifydownloadappliform()
	{
		homepage.clickondownloadappliform();
		String url=driver.getCurrentUrl();
		String title=driver.getTitle();
		
		/*Assert.assertEquals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Download_Application_Formhtml", url);
		Assert.assertEquals("Welcome to WBSEDCL", title);*/
		
		if(url.equals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Download_Application_Form.html"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		/*soft.assertEquals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Download_ApplicationFormhtml", url);
		soft.assertEquals("Welcome to WBSEDCL", title);
		soft.assertAll();*/
	}
		/*Assert.assertEquals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Download_Application_Formhtml", url);
		Assert.assertEquals("Welcome to WBSEDCL", title);*/
		/*if(url.equals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Download_Application_Form.html"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}*/
	
	//2nd Test Case
		@Test(priority=2)
		public void verifyconsumerdashboard()
		{
		homepage.clickonconsumerdashboard();
		String title=driver.getTitle();
		String url2=driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Consumer_Dashboard.html", url2);
		Assert.assertEquals("Welcome to WBSEDCL", title);
		}
	
		//3rd TestCase
		@Test(priority=1)
		public void verifyconectionformilities()
		{
		homepage.clickonconectionformilities();
		
		String url1=driver.getCurrentUrl();
		String title=driver.getTitle();
		/*Assert.assertEquals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/connection_formalities.html", url1);
		Assert.assertEquals("Welcome to WBSEDCL", title);*/
		
		if(url1.equals("https://www.wbsedcl.in/irj/go/km/docs/internet/new_website/Download_Application_Form.html"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		}
	
	/*	@Test(priority=10)
		public void gotoquationcalcutor()
		{
			homepage.clickonquaationcalculator();
			// ArrayList<String>=new ArrayList<String>(driver.getWindowHandles());
		}*/
	
	
	@AfterMethod
	public void clickonApplicationHeader(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Utility.capturescreenshot(driver);
		}
		
		applicationHeader.clickonlogo();	
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		applicationHeader=null;
		homepage=null;
		soft=null;
	}
	
	@AfterTest
	public void closedbrowser()
	{
		driver.close();
		driver=null;
		System.gc();
	}
	
}
