package demoqa_test;

import org.testng.annotations.Test;

import demoQA_page.SearchingWithFilters;

public class SearchingWithFiltersTest  extends LaunchAndQuit
{

	@Test
	public void filterTest() 
	{
	
		SearchingWithFilters ob=new SearchingWithFilters(driver);
		ob.searchbox();
		ob.filter();
	}	
}
