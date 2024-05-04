package demoQA_page;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task11_Validate_EntireCheckOut 
{

WebDriver driver;
	
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
	
	@FindBy(xpath = "//span[@class='a-declarative']//a[@id='addressChangeLinkId']")
	WebElement changeAddress;
	
	@FindBy(xpath = "//span[@class='address-edit-link']")
	WebElement updatenewAddress;
	
	@FindBy(xpath = "//span[@class='a-button-inner']//span[@class='a-dropdown-prompt']")
	WebElement countryoptions;
	
	@FindBy(xpath = "//li[@class='a-dropdown-item']//a[text()='India']")
	WebElement selectedCountry;
	
	@FindBy(xpath = "//div//input[@id='address-ui-widgets-enterAddressFullName']")
	WebElement fullElement;
	
	@FindBy(xpath ="//div/input[@id='address-ui-widgets-enterAddressPhoneNumber']" )
	WebElement mobilenumber;
	
	@FindBy(xpath = "//div/input[@id='address-ui-widgets-enterAddressPostalCode']")
	WebElement pincode;
	
	@FindBy(xpath = "//div/input[@id='address-ui-widgets-enterAddressLine1']")
	WebElement house_number;
	
	@FindBy(xpath = "//div/input[@id='address-ui-widgets-enterAddressLine2']")
	WebElement area_address;
	
	@FindBy(xpath = "//div/input[@id='address-ui-widgets-landmark']")
	WebElement landmark;
	
	@FindBy(xpath = "//div/input[@id='address-ui-widgets-enterAddressCity']")
	WebElement town_city;
	
	@FindBy(xpath = "//span[@id='address-ui-widgets-enterAddressStateOrRegion']")
	WebElement state_options;
	
	@FindBy(xpath = "//li//a[@id='address-ui-widgets-enterAddressStateOrRegion-dropdown-nativeId_34']")
	WebElement selected_state;
	
	@FindBy(xpath = "//span[@id='address-ui-widgets-form-submit-button']")
	WebElement use_this_addressButton;
	
	public void signin()
	{
		signin.click();
	}
	
	
	public void userLoginDetails()
	{
		emailfield.sendKeys("useryouremail@yopmail.com");
		continuebutton.click();
		passwordField.sendKeys("Welcome@123");
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
	
	public void changeAddress()
	{
		changeAddress.click();
		updatenewAddress.click();
		
	}
	
	public void updatingAddress()
	{
		countryoptions.click();
		selectedCountry.click();
		fullElement.clear();
		fullElement.sendKeys("Deepak Singh");
		mobilenumber.clear();
		mobilenumber.sendKeys("1234567891");
		pincode.clear();
		pincode.sendKeys("271208");
		house_number.clear();
		house_number.sendKeys("07");
		area_address.clear();
		area_address.sendKeys("Aliganj ,Kapoorthala Banarsi tola");
		landmark.clear();
		landmark.sendKeys("Mother Bless School");
		town_city.clear();
		town_city.sendKeys("Kanpur");
		state_options.click();
		selected_state.click();
		use_this_addressButton.click();
		
		
	}
	public Task11_Validate_EntireCheckOut(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
