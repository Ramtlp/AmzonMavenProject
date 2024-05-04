package demoQA_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingForProduct 
{
	WebDriver driver;

	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	
	
	public void searchbox()
	{
		searchbox.sendKeys("shoes");
		searchbutton.click();
	}

	
	public  SearchingForProduct(WebDriver driver) 
	{
	
		PageFactory.initElements(driver, this);
	}
}
