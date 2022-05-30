package WBSEDCL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath="//a[text()='Download Application forms']")
	private WebElement downloadappliform;
	
	@FindBy (xpath="(//a[text()='Consumer Dashboard'])[1]")
	private WebElement consumerdashboard;
	
	@FindBy (xpath="(//a[text()='Connection Formalities'])[1]")
	private WebElement conectionformilities;
	
	@FindBy (xpath="(//a[text()='Quotation Calculator'])[1]")
	private WebElement quatationcalcutor;
	
	
	
	
	private WebDriver driver;
	public HomePage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void clickondownloadappliform()
	{
		Actions act=new Actions(driver);
		act.moveToElement(downloadappliform).click().build().perform();
	}
	
	public void clickonconsumerdashboard()
	{
		Actions act=new Actions(driver);
		act.moveToElement(consumerdashboard).click().build().perform();
	}
	
	public void clickonconectionformilities()
	{
		Actions act=new Actions(driver);
		act.moveToElement(conectionformilities).click().build().perform();
	}
	
	public void clickonquaationcalculator()
	{
		Actions act=new Actions(driver);
		act.moveToElement(quatationcalcutor).click().build().perform();
	}

}
