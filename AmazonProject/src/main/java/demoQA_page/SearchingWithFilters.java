package demoQA_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchingWithFilters 
{
	WebDriver driver;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement searchbox;

	@FindBy(id="nav-search-submit-button")
	WebElement searchbutton;
	
	@FindBy(xpath = "//span/li[@id='p_89/ASIAN']//span[@class='a-list-item']")
	WebElement asianShoesSelected;
	
	@FindBy(xpath = "//span[@id='a-autoid-0']")
	WebElement SortByFeatured;
	
	@FindBy(xpath = "//li//a[@id='s-result-sort-select_2']")
	WebElement LowToHigh;
	
	@FindBy(xpath = "//span/li[@id='p_36/4516639031']//span[@class='a-list-item']")
	WebElement price_1000_to_2500;
	public void searchbox()
	{
		searchbox.sendKeys("shoes");
		searchbutton.click();
	}
	
	
	public void filter() 
	{
		asianShoesSelected.click();
		price_1000_to_2500.click();
		SortByFeatured.click();
		LowToHigh.click();
		
		
	}
	
	
   public SearchingWithFilters(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
