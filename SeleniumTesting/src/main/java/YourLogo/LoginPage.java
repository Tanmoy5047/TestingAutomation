package YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='passwd']")
	private WebElement password;
	
	@FindBy (xpath="//button[@id='SubmitLogin']//span")
	private WebElement signin;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendtoemial()
	{
		email.sendKeys("findtanmoy@gmail.com");
	}
	public void sendtopassword()
	{
		password.sendKeys("T@nmoy123");
	}
	public void clickonsignin()
	{
		signin.click();
	}
	
	}

