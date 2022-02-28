/**
 * 
 */
package com.TestClasses;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActionClasses.CustomListner;
import com.BaseClasses.BaseClass;
import com.PageFactory.RegisterPage;

/**
 * @author Vaibhav Garse
 *
 */
@Listeners(CustomListner.class)// this line we are using to make the ItestListner listen to your test case/script
public class RegisterTestCase extends BaseClass{
	
	@Test
	public void Registration()
	{
		Reporter.log("=================================Registration Test Case Started===============================================",true);
		RegisterPage rp=new RegisterPage(driver);
		rp.RegistrationProcess("Vaibh", "Gar", "vaibhav0134@gmail.com", "1234567800","234565" ,"234565");
		rp.TitleofWebDriver(driver);
		Reporter.log("=================================Registration Test Case Ended===============================================",true);
	}

}
