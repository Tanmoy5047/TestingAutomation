package IndianPost;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	
	@FindBy(xpath="//input[@id='USER']")
	private WebElement userid;
	
	@FindBy(xpath="//input[@id='PASSWORD']")
	private WebElement password;
	
	@FindBy(xpath="//input[@onclick='CheckForm(this.form)']")
	private WebElement signin1;
	
	
	public WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  clickonwelcome()
	{
		userid.sendKeys("TANMOY97");
		password.sendKeys("T@nmoy123");
		signin1.click();
	}

}
