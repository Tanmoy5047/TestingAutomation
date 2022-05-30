package YourLogo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {

	
	@FindBy(xpath="(//a[text()='T-shirts'])[2]")
	private WebElement tshirt;
	
	public MyAccount (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public void clickontshirt()
	{
		tshirt.click();
	}



}
