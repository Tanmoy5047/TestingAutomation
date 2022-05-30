package DesignModo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

	

	@FindBy (xpath="(//a[@class='menu-link'])[1]") 
	private WebElement products;

	@FindBy (xpath="//a[@class='button product-button rounded small green']") 
	private WebElement openapp;
	
	@FindBy (xpath="(//li[@class='modules-panel__category'])[1]") 
	private WebElement menu;
	
	@FindBy (xpath="(//ul[@id='modules-list']") 
	private WebElement module;
	
	private WebDriver driver;
	

public HomePage (WebDriver driver)
{
	PageFactory.initElements(driver, this);
	this.driver=driver;
}
	
	public void clickonproduct()
	{
		products.click();
	}
	
	public void clickonopenapp()
	{
		openapp.click();
	}
	
	public void draganddrop()
	{
		
		Actions act=new Actions(driver);
		act.dragAndDrop(menu, module).build().perform();
		
	}





}