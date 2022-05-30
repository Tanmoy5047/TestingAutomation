package Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import IndianPost1.HomePage;
import IndianPost1.LoginPage;
import IndianPost1.SavingsBank;

public class VerifyIndianPost {
	WebDriver driver;
	LoginPage login;
	HomePage homepage;
	SavingsBank savingsBank;
	@BeforeClass
	private void lounchbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "F:\\Velocity Class\\New folder\\chromedriver.exe");
		driver=new ChromeDriver();
		login =new LoginPage(driver);
	}
	
	@BeforeMethod
	private void logintoapplication()
	{
		driver.get("https://www.indiapost.gov.in/vas/Pages/IndiaPostHome.aspx");
		
		//login =new LoginPage(driver);
		login.clickonloginpage();
		homepage=new HomePage(driver);
		//homepage.clickonclosebutton();
		
	}
	
	@Test
	
	public void verifyclaculatepostage()
	{
		homepage=new HomePage(driver);

		//homepage=new HomePage(driver);
		homepage.clickonclosebutton();
		homepage.clickoncalculatepostage();
		
	}
	
	@Test
	
	public void verifysavingsbank()
	{		savingsBank=new SavingsBank (driver);

		//homepage=new HomePage(driver);
		homepage.clickonclosebutton();
		savingsBank.clickonsavingsbank();
	}
	
	@AfterMethod
	public void clickonlogout()
	{
		login.clickonlogout();
		
	}
	
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
	
	
	
	
	
	
	

}
