/**
 * 
 */
package com.TestClasses;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActionClasses.ActionClass;
import com.ActionClasses.CustomListner;
import com.BaseClasses.BaseClass;
import com.PageFactory.OrderPage;
import com.PageFactory.SearchResultPage;

/**
 * @author Vaibhav Garse
 *
 */
@Listeners(CustomListner.class)// this line we are using to make the ItestListner listen to your test case/script
public class OrderTestCase extends BaseClass {
	
	
	@Test
	public void orderEndToEndProcess() throws InterruptedException
	{
		Reporter.log("=================================Order End To End Process Test Case Started===============================================",true);
		SearchResultPage srp = new SearchResultPage(driver);
		srp.SearchResult("HP");
		srp.Clickelement();
		srp.clickonaddtocart();
		Thread.sleep(2000);
		OrderPage op=new OrderPage(driver);
		op.orderPageProcess(106, "Maharashtra", "445001");
		//ActionClass action = new ActionClass();
		//action.getTitleOfTheWebPage();
		Reporter.log("=================================Order End To End Process Test Case Ended===============================================",true);
	}

}
