/**
 * 
 */
package com.TestClasses;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActionClasses.CustomListner;
import com.BaseClasses.BaseClass;
import com.PageFactory.SearchResultPage;

/**
 * @author Vaibhav Garse
 *
 */
@Listeners(CustomListner.class)// this line we are using to make the ItestListner listen to your test case/script

public class SearchProductTestCase extends BaseClass{
	
	@Test
	public void SearchProcess() throws InterruptedException
	{
		Reporter.log("=================================SearchProcess Test Case Started===============================================",true);
		SearchResultPage srp = new SearchResultPage(driver);
		srp.getTitle(driver);
		srp.SearchResult1("HP");
		Reporter.log("=================================SearchProcess Test Case Ended===============================================",true);
	}
	

}
