package IndianPost1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SavingsBank {
	
	@FindBy(xpath="//button[@class='btn btn-danger callback-btn']")
	private WebElement closebutton;
	
	
	@FindBy(xpath="//img[@src='/_layouts/15/images/DOP.Portal.UILayer/Post_office_savings_bank_Icon.svg'")
	private WebElement savingsbank;
	
	public SavingsBank(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonclosebutton()
	{
		closebutton.click();
	}
	
	public void clickonsavingsbank()
	{
		savingsbank.click();
	}


}
