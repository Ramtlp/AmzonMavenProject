package demoqa_test;

import org.testng.annotations.Test;

import demoQA_page.EditProfile;

public class EditProfileTest extends LaunchAndQuit
{
	@Test
	public void ditprofileTest()
	{
		EditProfile ob=new EditProfile(driver);
		ob.signin();
		ob.userLoginDetails();
		ob.clickonAccountAndList();
		ob.loginSection();
		ob.editSection();
		
	}
}
