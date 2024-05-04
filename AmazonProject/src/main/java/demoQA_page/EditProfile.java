package demoQA_page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EditProfile 
{

	//Check if a user can successfully edit their profile
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
	
	@FindBy(xpath="//span[text()='Account & Lists']")
	WebElement account_and_list;
	
	@FindBy(xpath="//span[text()='Edit login, name, and mobile number']")
	WebElement loginSection;
	
	@FindBy(xpath = "//span[@id='cvf-submit-otp-button']//span[@class='a-button-inner']")
	WebElement SubmitCode;
 
	@FindBy(xpath="//span[@id='NAME_BUTTON']")
	WebElement nameEdit;
	
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	WebElement newNameField;
	
	@FindBy(xpath = "//input[@id='cnep_1C_submit_button']")
	WebElement saveChangesButton;
	
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
	
	public void clickonAccountAndList()
	{
		account_and_list.click();
	}
	public void loginSection()
	{
		loginSection.click();
		SubmitCode.click();
	}
	
	public void editSection()
	{
		nameEdit.click();
		newNameField.clear();
		newNameField.sendKeys("Ram Shanker Singh");
		saveChangesButton.click();
	}
	public EditProfile(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
