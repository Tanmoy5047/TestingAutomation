package DesignModo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	
	
	@FindBy (xpath="//div[@class='button small passive hover-green wide cropSides']") 
	private WebElement hiddenpopup;
	
	@FindBy (xpath="//a[@class='menu-link p phone-small semiBold middle inlineBlock  padding-right-2 shift-left-5 phone-hide']") 
	private WebElement login;

	@FindBy (xpath="//input[@id='username']") 
	private WebElement email;
	
	@FindBy (xpath="//input[@id='password']") 
	private WebElement password;
	
	@FindBy (xpath="(//span[@class='element'])[2]") 
	private WebElement agreechechbox;
	
	@FindBy (xpath="(//button[@type='submit'])[1]") 
	private WebElement loginbutton;
	
	
	@FindBy (xpath="(//a[@class='menu-link middle dropdownTrigger shift-up-2']//img") 
	private WebElement profile;
	
	@FindBy (xpath="((//a[text()='Sign Out'])[1]") 
	private WebElement logout;
	
	public LogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickonLoginpage()
	{	hiddenpopup.click();
		login.click();
		email.sendKeys("findtanmoyghosh@gmail.com");
		password.sendKeys("T@nmoy123");
		loginbutton.click();
	}
	
	public void clickonlogout()
	{
		profile.click();
		logout.click();
	}

	
	
	
	
	
	
	
	
	
	
	
}
