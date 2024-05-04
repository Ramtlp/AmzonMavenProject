package demoQA_page;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import excel_utility.Excel_RegistrationDetails;

public class RegistrationPage extends Excel_RegistrationDetails
{
	
WebDriver driver;

	
	@FindBy(xpath = "//a[@id='nav-link-accountList']")
	WebElement hoverToAccount;
	
	@FindBy(xpath = "//div[@id='nav-flyout-ya-newCust']//a[@class='nav-a'][normalize-space()='Start here.']")
	WebElement createNewAccountHere;
	
	@FindBy(id="ap_customer_name")
	WebElement fullname;
	
	@FindBy(id="ap_phone_number")
	WebElement mobileNumber;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="continue")
	WebElement clickonVerify;
	
	public void clickonAccountAndLists(WebDriver driver) throws InterruptedException, IOException
	{
		Actions act=new Actions(driver);
		act.moveToElement(hoverToAccount).perform();
		createNewAccountHere.click();
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destination= new File("E:\\AmazonProject\\ScreenShots\\PopScreenShot.png");
		FileUtils.copyFile(src, destination);
	}
	
	public void userRegistrationDetails() throws EncryptedDocumentException, IOException
	{
		userData();
		fullname.sendKeys(fname);
		mobileNumber.sendKeys(mo_number);
		password.sendKeys(pwd);
		clickonVerify.click();
	}

	
	public RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}

