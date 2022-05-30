package YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutpage {
	
	@FindBy(xpath="//a[@title='Log me out']")
	private WebElement logout;
	
	public LogOutpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonlogout()
	{
		logout.click();
	}
	
	

}
