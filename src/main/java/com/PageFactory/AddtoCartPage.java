/**
 * 
 */
package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionClasses.ActionClass;

/**
 * @author Vaibhav Garse
 *
 */

public class AddtoCartPage {
	@FindBy(xpath = "//span[normalize-space()='Add to Cart']") private WebElement addtocart;
	@FindBy(xpath = "//div[@id='content']//div[@class='col-sm-4']") private WebElement productdetails;
	@FindBy(xpath = "//input[@id='input-option225']") private WebElement Deliverydatetextbox;
	@FindBy(xpath = "//input[@id='input-quantity']") private WebElement quantitytextbox;
	@FindBy(xpath = "//button[@id='button-cart']") private WebElement Addtocardconfirmbutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']") private WebElement SuccesfullAddToCartmsg;
	
	ActionClass action=new ActionClass();
	public  AddtoCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getAddtocart() {
		return addtocart;
	}


	public WebElement getProductdetails() {
		return productdetails;
	}


	public WebElement getDeliverydatetextbox() {
		return Deliverydatetextbox;
	}


	public WebElement getQuantitytextbox() {
		return quantitytextbox;
	}


	public WebElement getAddtocardconfirmbutton() {
		return Addtocardconfirmbutton;
	}


	public WebElement getSuccesfullAddToCartmsg() {
		return SuccesfullAddToCartmsg;
	}
 
	//action methods 
	public void clickaddtocart()
	{
		addtocart.click();
	}
	public void productdetails()
	{
		System.out.println(productdetails.getText());
	}

	public void enterDeliveryDate(String yyyymmdd)
	{
		Deliverydatetextbox.sendKeys(yyyymmdd);
	}
	public void enterQuantity(String num)
	{
		quantitytextbox.sendKeys(num);
	}
	public void confirmAddtoCart()
	{
		Addtocardconfirmbutton.click();
	}
	public String succesMsg()
	{
		return SuccesfullAddToCartmsg.getText();
	}
}
