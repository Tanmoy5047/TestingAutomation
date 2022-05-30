package IndianPost1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//button[@class='btn btn-danger callback-btn']")
	private WebElement closebutton;
	
	@FindBy(xpath="//img[@src='/_layouts/15/images/DOP.Portal.UILayer/Calculator_Icon.svg']")
	private WebElement calculatepostage;
	
	
	/*@FindBy(xpath="//button[@class='btn btn-danger callback-btn']")
	private WebElement closebutton1;*/
	
	/*@FindBy(xpath="//img[@src='/_layouts/15/images/DOP.Portal.UILayer/Post_office_savings_bank_Icon.svg'")
	private WebElement savingsbank;*/
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonclosebutton()
	{
		closebutton.click();
	}
	
	public void clickoncalculatepostage()
	{
		calculatepostage.click();
	}
	
	/*public void clickonclosebutton1()
	{
		closebutton1.click();
	}*/
	

	/*public void clickonsavingsbank()
	{
		savingsbank.click();
	}*/
}
