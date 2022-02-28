/**
 * 
 */
package com.TestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
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
public class InvalidLogineTestCase extends BaseClass{
	@Test
	public void InvalidLoginTestCase() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Reporter.log("=================================Invalid LoginTest Case Started===============================================",true);
		LoginPage lgp = new LoginPage(driver);
		lgp.invalidLoginProcess(driver, "Vaibhav");
		Reporter.log("=================================Invalid LoginTest Case Ended===============================================",true);
	}

}
