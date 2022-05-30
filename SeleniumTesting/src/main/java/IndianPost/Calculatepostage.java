package IndianPost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Calculatepostage {
	
	@FindBy(xpath="//button[@class='btn btn-danger callback-btn']")
	private WebElement closebutton;
	
	@FindBy(xpath="//img[@src='/_layouts/15/images/DOP.Portal.UILayer/Calculator_Icon.svg']")
	private WebElement calculatepostage;
	
	@FindBy(xpath="//img[@src='/_layouts/15/images/DOP.Portal.UILayer/Post_office_savings_bank_Icon.svg']")
	private WebElement bank;
	
	@FindBy(xpath="//button[@class='btn btn-danger callback-btn']]")
	private WebElement closebutton1;
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public Calculatepostage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		//wait =new WebDriverWait(driver,20);

		
	}
	
	public void clickonApplicationHeader()
	{
		
		wait =new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.visibilityOf(closebutton));
		closebutton.click();
		
	}
	public void clickonclacutrpage()
	{		
		wait =new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(calculatepostage));
		
		calculatepostage.click();
		/*Actions act=new Actions(driver);
		act.moveToElement(calculatepostage).click().build().perform();*/

	}
	public void closebuttonclick()
	{		
		
		
		closebutton1.click();
		

	}
	
	
	
	public void clickonsavingbank()
	{
		bank.click();
	}
	

}






































