package IndianPost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement hiddenpopup;
	
	@FindBy(xpath="//span[@id='ctl00_UCLogin1_lblSignIn']")
	private WebElement signin;
	
	@FindBy(xpath="//span[@id='ctl00_UCLogin1_lblRegisteredUser']")
	private WebElement registeduser;
	
	@FindBy(xpath="//input[@id='USER']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@id='PASSWORD']")
	private WebElement password;
	
	@FindBy(xpath="//input[@onclick='CheckForm(this.form)']")
	private WebElement signin1;
	
	
	public LogIn(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsignin()
	{
		hiddenpopup.click();
		signin.click();
		registeduser.click();
		userid.sendKeys("TANMOY97");
		password.sendKeys("T@nmoy123");
		signin1.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
