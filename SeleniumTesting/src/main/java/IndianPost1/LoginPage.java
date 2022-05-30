package IndianPost1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
	@FindBy(xpath="//button[@class='btn btn-danger callback-btn']")
	private WebElement hiddenbutton;
	
	@FindBy(xpath="//span[@id='ctl00_UCLogin1_lblSignIn']")
	private WebElement signin;
	
	@FindBy(xpath="//span[@id='ctl00_UCLogin1_lblRegisteredUser']")
	private WebElement registeruser;
	
	@FindBy(xpath="//input[@id='USER']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@id='PASSWORD']")
	private WebElement password;
	
	@FindBy(xpath="//input[@onclick='CheckForm(this.form)']")
	private WebElement signin1;
	
	@FindBy(xpath="//a[@id='ctl00_UCLogin1_lnkBtnLogout']")
	private WebElement logout;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonloginpage()
	{
		hiddenbutton.click();
		signin.click();
		registeruser.click();
		userid.sendKeys("TANMOY97");
		password.sendKeys("T@nmoy123");
		signin1.click();
	}
	
	public void clickonlogout()
	{
		logout.click();
	}
	
	
	
	
	
	
}
