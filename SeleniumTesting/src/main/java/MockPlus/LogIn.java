package MockPlus;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement login;

}
