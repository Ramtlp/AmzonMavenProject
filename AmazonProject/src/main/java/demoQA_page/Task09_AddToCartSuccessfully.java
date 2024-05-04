package demoQA_page;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Task09_AddToCartSuccessfully 
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
	
	public Task09_AddToCartSuccessfully(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
