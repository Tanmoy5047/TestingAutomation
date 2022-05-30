package WBElectricity;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QuatationCalculator {
	
	WebDriver driver;
	
	@FindBy (xpath="(//a[text()='Quotation Calculator'])[1]")
	private WebElement quatationcalcutor;
	
	
	
	
	
	public QuatationCalculator(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	public void clickonquaationcalculator()
	{
		Actions act=new Actions(driver);
		act.moveToElement(quatationcalcutor).click().build().perform();
		
		
	}

}
