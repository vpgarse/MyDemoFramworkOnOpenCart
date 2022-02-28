/**
 * 
 */
package com.TestClasses;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActionClasses.CustomListner;
import com.BaseClasses.BaseClass;
import com.PageFactory.LoginPage;

/**
 * @author Vaibhav Garse
 *
 */
@Listeners(CustomListner.class)// this line we are using to make the ItestListner listen to your test case/script
public class LoginTestCase extends BaseClass{
	
	@Test
	public void ValidLoginTestCase()
	{
		Reporter.log("=================================Valid LoginTest Case Started===============================================",true);
		LoginPage LoginP = new LoginPage(driver);
		LoginP.LoginProcess(driver, "rahul0123@gmail.com", "0987654321");
		Reporter.log("=================================Valid LoginTest Case Ended===============================================",true);
	}
	

}
