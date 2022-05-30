package Flipkart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopNow {
	
	@FindBy(xpath="(//p[text()='Shop Now'])[1]")
	private WebElement realme;
	
	public ShopNow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickonrealme() {
		realme.click();
	}

}
