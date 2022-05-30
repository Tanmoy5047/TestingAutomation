package InsuranceProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy(xpath="//div[@class='navigation__mobile-bar-wrapper d-lg-none']")
	 private WebElement insurance;
	
	
	@FindBy(xpath="//div[@class='navigation__mobile-bar-wrapper d-lg-none']")
	private WebElement lifeinsurance;
	
	@FindBy(xpath="//*[@id=\\\"farmers-product-2-0\\\"]/div/div/div/div[2]/header/div/div[1]/div[1]/div[2]/div/form/div/div[3]/div/button[2]/span")
	private WebElement getquate;
	
	private WebDriver driver;
	private Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void movetoinsurance()
	{
		Actions act=new Actions(driver);
		act.moveToElement(insurance).build().perform();
	}
	
	public void  movetolifeinsurance()
	{
		Actions act=new Actions(driver);
		act.moveToElement(lifeinsurance).click().build().perform();
	}
	public void cliconquate()
	{
		getquate.click();
	}
	

}
