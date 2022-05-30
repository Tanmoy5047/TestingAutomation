package YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
	@FindBy(xpath="//a[@title='My orders']")
	private WebElement myorder;
	
	public OrderHistory(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonmyorder()
	{
		myorder.click();
	}
}
