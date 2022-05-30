package WBElectricity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	@FindBy (xpath="(//a[@href='Energy_Awareness.html'])[1]")
	private WebElement energyawareness;
	
	@FindBy (xpath="(//a[@href='Tips_To_Conserve_Energy.html'])[1]")
	private WebElement conserverenergy;
	
	
	
	private WebDriver driver;
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	
	public void clickonenergyawareness()
	{
		Actions act=new Actions(driver);
		act.moveToElement(energyawareness).click().build().perform();
			
	}
	
	public void cilckonconserverenergy()
	{
		Actions act=new Actions(driver);
		act.moveToElement(conserverenergy).click().build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
