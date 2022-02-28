/**
 * 
 */
package com.TestClasses;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.BaseClasses.BaseClass;
import com.PageFactory.LoginPage;
import com.PageFactory.OrderPage;
import com.PageFactory.SearchResultPage;

/**
 * @author Vaibhav Garse
 *
 */
public class StartToEndProcessTestcase extends BaseClass{
	
	@Test
	public void endToendProcess() throws InterruptedException
	{
		Reporter.log("=================================endToendProcess Test Case Started===============================================",true);
		LoginPage lp=new LoginPage(driver);
		lp.LoginProcess(driver, "rahul0123@gmail.com", "0987654321");
		SearchResultPage srp = new SearchResultPage(driver);
		Reporter.log("Login Page Process Completed ",true);
		srp.SearchResult1("Hp");
		Reporter.log("Search Result Page Process Completed ",true);
		OrderPage op = new OrderPage(driver);
		op.orderPageProcess(106, "Maharashtra", "445001");
		Reporter.log("Order Page Process Completed ",true);
		Reporter.log("=================================endToendProcess Test Case Started===============================================",true);
	}

}
