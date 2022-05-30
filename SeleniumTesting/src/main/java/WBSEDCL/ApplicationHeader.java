package WBSEDCL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath="//a[@id='Consumer']")
	private WebElement cunsumercorner;
	
	@FindBy (xpath="//li[@id='connMgmt']")
	private WebElement connectionmanagement;
	
	@FindBy (xpath="//img[@class=' icon-logo pull-left']")
	private WebElement logo;
	
	
	private WebDriver driver;
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	public void movetoapplicationHeader()
	{
		Actions act=new Actions(driver);
		act.moveToElement(cunsumercorner).build().perform();
	}
	
	public void movetoconnectionmanagement()
	{
		Actions act=new Actions(driver);
		act.moveToElement(connectionmanagement).build().perform();
	}
	
	public void clickonlogo()
	{
		logo.click();
	}
	
	
	

}
