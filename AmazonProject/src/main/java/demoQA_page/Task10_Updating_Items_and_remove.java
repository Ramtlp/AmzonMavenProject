package demoQA_page;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task10_Updating_Items_and_remove 
{

	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchIcon;
	
	@FindBy(xpath="(//div[@class='s-image-padding'])[1]")
	WebElement selectedproduct;
	
	@FindBy(xpath = "//span[@id='submit.add-to-cart']//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath = "//div[@id='nav-cart-count-container']//span[@id='nav-cart-count']")
	WebElement addtocartbutton;
	
	@FindBy(xpath = "//span[@class='a-button-inner']//span[@id='a-autoid-0-announce']")
	WebElement quantity;
	
	@FindBy(xpath = "//a[@id='quantity_8']")
	WebElement udpatethequantity;
	
	@FindBy(xpath = "//span[@class='a-size-small sc-action-delete']//input[@class='a-color-link']")
	WebElement removeitems;
	
	
	public void searchbox() 
	{
		
		searchbox.sendKeys("Shoes");
		searchIcon.click();
		selectedproduct.click();
	}
	
	public void addedtocart(WebDriver driver)
	{
		Set<String>s=driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> itr= s.iterator();
		String parent=itr.next();
		String childwindow=itr.next();
		driver.switchTo().window(childwindow);
		
		addtocart.click();
	}

	public void update_remvoe_button()
	{
		addtocartbutton.click();
		quantity.click();
		udpatethequantity.click();
		removeitems.click();
	}
	
	public Task10_Updating_Items_and_remove(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
