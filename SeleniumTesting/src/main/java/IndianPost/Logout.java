package IndianPost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	
	@FindBy(xpath="//a[@id='ctl00_UCLogin1_lnkBtnLogout']")
	private WebElement logout;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogout()
	{
		logout.click();
		
	}

}
