package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy (xpath="(//input[@autocomplete='off'])[2]") 
	private WebElement mobileno;

	@FindBy(xpath="(//input[@autocomplete='off'])[3]")
	private WebElement password;
	
	@FindBy(xpath="//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")
	private WebElement login;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void sendMobileno() {
		mobileno.sendKeys("9002789141");
	}
		
	public void sendPassword() {
			password.sendKeys("Prit@m123");
		}
	
	public void clickOnLoginButton() {
		login.click();
	}
	
	
	
	}
	
	
	
	
	
	
