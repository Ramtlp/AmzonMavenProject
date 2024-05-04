package demoqa_test;

import org.testng.annotations.Test;

import demoQA_page.LoginWithValidPage;

public class LoginWithValidPageTest extends LaunchAndQuit
{

	@Test
	public void logintest()
	{
		LoginWithValidPage ob=new LoginWithValidPage(driver);
		ob.signin();
		ob.userLoginDetails();
	}
}
