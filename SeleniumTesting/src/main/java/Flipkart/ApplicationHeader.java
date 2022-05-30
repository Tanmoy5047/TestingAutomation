package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApplicationHeader {
	
	@FindBy(xpath="(//div[@class='eFQ30H'])[3]//div[2]")
	private WebElement mobiles;
	
	public ApplicationHeader(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonmobile() {
		mobiles.click();
	}

}
