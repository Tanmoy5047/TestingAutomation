package WBElectricity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy (xpath="//a[@id='Consumer']")
	private WebElement cunsumercorner;
	
	@FindBy (xpath="//li[@id='energyConserve']//a")
	private WebElement energyconservation;
	
	/*@FindBy (xpath="(//a[@href='Energy_Awareness.html'])[1]")
	private WebElement energyawareness;*/
	
	
	@FindBy (xpath="//img[@class=' icon-logo pull-left']")
	private WebElement logo;
	
	private WebDriver driver;
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void movetocunsumercorner()
	{
		Actions act=new Actions (driver);
		act.moveToElement(cunsumercorner).build().perform();
	}
	
	public void movetoenergyconservation()
	{
		Actions act=new Actions (driver);
		act.moveToElement(energyconservation).build().perform();
	}
	
	/*public void clickonenergyawareness()
	{
		Actions act=new Actions(driver);
		act.moveToElement(energyawareness).click().build().perform();
			
	}
	*/
	public void clickonlogo()
	{
		logo.click();
	}
	
	
	
	

	
	

}
