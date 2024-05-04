package demoqa_test;

import org.testng.annotations.Test;

import demoQA_page.SearchingForProduct;

public class SearchingForProductTest extends LaunchAndQuit
{

	@Test
	public void searchproducttest()
	{
		SearchingForProduct ob=new SearchingForProduct(driver);
		ob.searchbox();
		
	}
}
