package demoqa_test;

import org.testng.annotations.Test;

import demoQA_page.Task09_AddToCartSuccessfully;

public class Task09_AddToCartSuccessfullyTest extends LaunchAndQuit
{

	@Test
	public void gettest() 
	{
		Task09_AddToCartSuccessfully ob=new Task09_AddToCartSuccessfully(driver);
		ob.searchbox();
		ob.addedtocart(driver);
	}
}
