package demoqa_test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import demoQA_page.RegistrationPage;

public class RegistrationPageTest extends LaunchAndQuit
{
	
	
	@Test
	public void resgistrationtest() throws EncryptedDocumentException, IOException, InterruptedException 
	{
	
	 RegistrationPage ob=new RegistrationPage(driver);
	 ob.clickonAccountAndLists(driver);
	 ob.userRegistrationDetails();

	}
	
	
}
