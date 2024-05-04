package demoqa_test;

import java.io.IOException;


import org.testng.annotations.Test;

import demoQA_page.Task10_Updating_Items_and_remove;

public class Task10_Test extends LaunchAndQuit
{
	
	@Test
	public void addtocarttest() 
	{
		Task10_Updating_Items_and_remove ob=new Task10_Updating_Items_and_remove(driver);
		ob.searchbox();
		ob.addedtocart(driver);
		ob.update_remvoe_button();
		
		
	}
}
