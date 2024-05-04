package demoQA_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginWithInValidPage 
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
		emailfield.sendKeys("87950");
		continuebutton.click();
		passwordField.sendKeys("Welcome@123");
		signInButton.click();
	}
	
	public LoginWithInValidPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
