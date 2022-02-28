/**
 * 
 */
package com.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionClasses.IAutoConst;

/**
 * @author Vaibhav Garse
 *
 */
public class LoginPage implements IAutoConst{
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']") private WebElement logindropdownbutton;
	@FindBy(xpath = "//input[@id='input-email']") private WebElement usernametextbox;
	@FindBy(xpath = "//input[@id='input-password']") private WebElement passwordtextbox;
	@FindBy(xpath = "//div[@class='form-group']//a[normalize-space()='Forgotten Password']") private WebElement forgotpasswordlink;
	@FindBy(xpath = "//input[@value='Login']") private WebElement loginbutton;
	@FindBy(xpath = "//div[@id='account-account']") private WebElement accountpage;
	@FindBy(xpath = "//i[@class='fa fa-user']") private WebElement myaccount;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']") private WebElement alert;
	
	
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getAlert() {
		return alert;
	}


	public WebElement getLogindropdownbutton() {
		return logindropdownbutton;
	}


	public WebElement getUsernametextbox() {
		return usernametextbox;
	}


	public WebElement getPasswordtextbox() {
		return passwordtextbox;
	}


	public WebElement getForgotpasswordlink() {
		return forgotpasswordlink;
	}


	public WebElement getLoginbutton() {
		return loginbutton;
	}


	public WebElement getAccountpage() {
		return accountpage;
	}

	//action methods
	
	public void clickonLogin(WebElement element)
	{
		element.click();
	}
	public String getLoginPageText(WebDriver driver)
	{
		return driver.getTitle();
		
	}
	public void loginsendkeys(String username,String password)
	{
		usernametextbox.sendKeys(username);
		passwordtextbox.sendKeys(password);
	}
	public void clearTextField()
	{
		usernametextbox.clear();
		passwordtextbox.clear();
	}
	public void AccountPageTitle(WebDriver driver)
	{
		System.out.println("The Page Tittle is :"+driver.getTitle());
	}
	public WebElement getErrMsg() {

		return alert;
	}
	//All in one method
	public void LoginProcess(WebDriver driver, String usn, String pass)
	{
		clickonLogin(myaccount);
		clickonLogin(logindropdownbutton);
		System.out.println("Login page launched successfully ");
		System.out.println(getLoginPageText(driver));
		loginsendkeys(usn, pass);
		clickonLogin(loginbutton);
		System.out.println("Login to Opencart by using  "+usn+" this Mail ID");
		AccountPageTitle(driver);
	}
	
	

	public void invalidLoginProcess(WebDriver driver, Object Keyname) throws EncryptedDocumentException, IOException, InterruptedException
	{
		clickonLogin(myaccount);
		AccountPageTitle(driver);
		clickonLogin(logindropdownbutton);
		System.out.println(getLoginPageText(driver));
		String username = getCredentialMaP().get(Keyname).split(":")[0];
		String password = getCredentialMaP().get(Keyname).split(":")[1];

		loginsendkeys(username, password);
		clickonLogin(loginbutton);
		Thread.sleep(3000);
		System.out.println(" You are entered Invalid Credentials so You got this alert Massage :  "+getAlert());
		System.out.println("Enterd Username "+username+" And Password "+ password+" is Not Correct");
		System.out.println(" Please Enter Correct Email Id ANd Password ");
		AccountPageTitle(driver);
		clearTextField();
		
		
		
	}
	public static  HashMap<String, String> getCredentialMaP()
	{
		HashMap<String ,String> userMap=new HashMap<String,String>();
		userMap.put("Vaibhav", "VaibhavGarse:@12345");
		userMap.put("Rahul", "Rahul:00000");
		userMap.put("Sachin", "Sachin:88888");
		userMap.put("Ram", "Ram:Ram@123");
		userMap.put("Rajat", "Rajat:22222");
		return userMap;
	}
}
