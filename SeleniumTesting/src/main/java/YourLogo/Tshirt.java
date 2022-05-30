package YourLogo;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Tshirt {
	@FindBy(xpath="(//button[@type='submit'])[3]//span")
	private WebElement addtocart;
	
	public Tshirt (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickonaddtocart()
	{
		
		addtocart.click();
	}
	
	
	

}
