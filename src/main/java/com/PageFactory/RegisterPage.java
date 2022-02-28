/**
 * 
 */
package com.PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Vaibhav Garse
 *
 */
public class RegisterPage {
	
	@FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']") private WebElement Register;
	@FindBy(xpath = "//aside[@id='column-right']") private WebElement columrighthand;
	@FindBy(xpath = "//input[@id='input-firstname']") private WebElement firstname;
	@FindBy(xpath = "//input[@id='input-lastname']") private WebElement lastname;
	@FindBy(xpath = "//input[@id='input-email']") private WebElement email;
	@FindBy(xpath = "//input[@id='input-telephone']") private WebElement telephone;
	@FindBy(xpath = "//input[@id='input-password']") private WebElement password;
	@FindBy(xpath = "//input[@id='input-confirm']") private WebElement confpassword;
	@FindBy(xpath = "//label[normalize-space()='Yes']//input[@name='newsletter']") private WebElement yessubscribe;
	@FindBy(xpath = "//input[@value='0']") private WebElement nosubscribe;
	@FindBy(xpath = "//input[@name='agree']") private WebElement agreecheckbox;
	@FindBy(xpath = "//input[@value='Continue']") private WebElement continuebutton;
	@FindBy(xpath = "//h1[normalize-space()='Your Account Has Been Created!']") private WebElement confirmationmsg;
	@FindBy(xpath = "//a[@class='btn btn-primary']") private WebElement primarycontinuebutton;
	@FindBy(xpath = "//i[@class='fa fa-user']") private WebElement myaccount;

	
	


	public  RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getMyaccount() {
		return myaccount;
	}


	public WebElement getRegister() {
		return Register;
	}



	public WebElement getColumrighthand() {
		return columrighthand;
	}



	public WebElement getFirstname() {
		return firstname;
	}



	public WebElement getLastname() {
		return lastname;
	}



	public WebElement getEmail() {
		return email;
	}



	public WebElement getTelephone() {
		return telephone;
	}



	public WebElement getPassword() {
		return password;
	}



	public WebElement getConfpassword() {
		return confpassword;
	}



	public WebElement getYessubscribe() {
		return yessubscribe;
	}



	public WebElement getNosubscribe() {
		return nosubscribe;
	}



	public WebElement getAgreecheckbox() {
		return agreecheckbox;
	}



	public WebElement getContinuebutton() {
		return continuebutton;
	}



	public WebElement getConfirmationmsg() {
		return confirmationmsg;
	}



	public WebElement getPrimarycontinuebutton() {
		return primarycontinuebutton;
	}
	//Action Methods
	public void doclick(WebElement Clickelement)
	{
		Clickelement.click();
		
	}
	public void sendKeys(WebElement Sendelement, String SendText)
	{
		Sendelement.sendKeys(SendText);
	}
	public void Textofelement(WebElement Textelement)
	{
		System.out.println("Text of The WebPage : "+Textelement.getText());
	}
	public void TitleofWebDriver(WebDriver driver)
	{
		System.out.println("Tittle of The WebPage : "+driver.getTitle());
	}
	public void RegistrationProcess(String FirstNametext, String LastNameText, String Email, String PhoneNumber, String Password, String ConfirmPassword)
	{
		doclick(myaccount);
		doclick(Register);
		sendKeys(firstname, FirstNametext);
		sendKeys(lastname, LastNameText);
		sendKeys(email, Email);
		sendKeys(telephone, PhoneNumber);
		sendKeys(password, Password);
		sendKeys(confpassword, ConfirmPassword);
		doclick(nosubscribe);
		doclick(agreecheckbox);
		doclick(continuebutton);
		Textofelement(confirmationmsg);
		doclick(primarycontinuebutton);
		System.out.println("Registration Successfully ");
	}
	
	
	public WebElement getElement(String text)
	{
	  By element=By.xpath("//a[@class='list-group-item' and .='"+text+"']");
	return (WebElement) element;
	}
}
