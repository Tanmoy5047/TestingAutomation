package MockPlus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn {
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement email;
	
	@FindBy (xpath="//input[@id='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[text()='Sign in']")
	private WebElement login;




public LogIn (WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void csendtoemail()
{
	email.sendKeys("findtanmoyghosh");
}

public void sentopassword()
{
	password.sendKeys("Tanmoy");
}

public void clickonlogin()
{
	login.click();
}

}