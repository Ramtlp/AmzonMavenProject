package demoQA_page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Task12_SelectEachPaymentMehtod 
{
	@FindBy(xpath = "//span[text()='Account & Lists']")
	WebElement signin;
	
	@FindBy(id="ap_email")
	WebElement emailfield;
	
	@FindBy(id="continue")
	WebElement continuebutton;
	
	@FindBy(id="ap_password")
	WebElement passwordField;
	
	@FindBy(id="signInSubmit")
	WebElement signInButton;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']")
	WebElement searchbox;
	
	@FindBy(id="nav-search-submit-button")
	WebElement searchIcon;
	
	@FindBy(xpath="(//div[@class='s-image-padding'])[1]")
	WebElement selectedproduct;
	
	@FindBy(xpath = "//span[@id='submit.add-to-cart']//input[@id='add-to-cart-button']")
	WebElement addtocart;
	
	@FindBy(xpath = "//span[@id='desktop-ptc-button-celWidget']//span[@id='sc-buy-box-ptc-button']")
	WebElement proeceed_to_buy;
	
	@FindBy(xpath = "//div[@class='a-row a-spacing-base']//span[text()='Credit or debit card']")
	WebElement credicart_or_debit_card;
	
	
	@FindBy(xpath = "(//span[text()='Amazon accepts all major credit &  cards'])[1]")
	WebElement enter_card_details;
	
	@FindBy(xpath = "//iframe[@name='ApxSecureIframe']")
	WebElement iframefor_cardDetailsPop;
	
	@FindBy(xpath = "//input[@name='addCreditCardNumber']")
	WebElement cardnumber_field;
	
	@FindBy(xpath = "//select[@name='ppw-expirationDate_month']")
	WebElement expiry_month;
	
	@FindBy(xpath = "//select[@name='ppw-expirationDate_year']")
	WebElement expiry_year;
	
	@FindBy(xpath = "//input[@name='ppw-widgetEvent:AddCreditCardEvent']")
	WebElement sumbit_details;
	public void signin()
	{
		signin.click();
	}
	
	
	public void userLoginDetails()
	{
		emailfield.sendKeys("8795012752");
		continuebutton.click();
		passwordField.sendKeys("Ram023866@");
		signInButton.click();
	}
	
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
		proeceed_to_buy.click();
	}
	
	public void paymentMethodSelection(WebDriver driver)
	{
		credicart_or_debit_card.click();
		enter_card_details.click();
		
		driver.switchTo().frame(iframefor_cardDetailsPop);
		cardnumber_field.sendKeys("5425233430109903");
		Select obj1=new Select(expiry_month);
		obj1.selectByValue("12");
		
		Select obj2=new Select(expiry_year);
		obj2.selectByValue("2033");
		
		sumbit_details.click();
		
	}
	
	public Task12_SelectEachPaymentMehtod(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
