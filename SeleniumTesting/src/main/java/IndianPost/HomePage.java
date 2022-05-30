package IndianPost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement hiddenpopup;
	
	@FindBy(xpath="//span[@id='ctl00_UCLogin1_lblSignIn']")
	private WebElement signin;
	
	@FindBy(xpath="//span[@id='ctl00_UCLogin1_lblRegisteredUser']")
	private WebElement registeduser;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonsignin()
	{
		hiddenpopup.click();
		signin.click();
		registeduser.click();
	}
}
