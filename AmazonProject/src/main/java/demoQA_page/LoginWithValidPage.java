package demoQA_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithValidPage 
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
	
	public LoginWithValidPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
