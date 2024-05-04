package demoqa_test;

import org.testng.annotations.Test;

import demoQA_page.Task12_SelectEachPaymentMehtod;

public class Task12_Test extends LaunchAndQuit
{
	@Test

	public void testData() 
	{
		Task12_SelectEachPaymentMehtod ob=new Task12_SelectEachPaymentMehtod(driver);
		ob.signin();
		ob.userLoginDetails();
		ob.searchbox();
		ob.addedtocart(driver);
		ob.paymentMethodSelection(driver);
	}
}
