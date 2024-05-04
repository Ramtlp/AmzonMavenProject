package demoqa_test;

import org.testng.annotations.Test;

import demoQA_page.LoginWithInValidPage;

public class LoginWithInValidPageTest extends LaunchAndQuit
{
	@Test
	public void logInvalidTest()
	{
		LoginWithInValidPage ob=new LoginWithInValidPage(driver);
		ob.signin();
		ob.userLoginDetails();
		
	}
}
