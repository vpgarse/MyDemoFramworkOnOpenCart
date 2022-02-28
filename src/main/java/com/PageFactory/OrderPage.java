/**
 * 
 */
package com.PageFactory;

import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ActionClasses.ActionClass;

/**
 * @author Vaibhav Garse
 *
 */
public class OrderPage {
	@FindBy(xpath = "//button[@id='button-cart']") private WebElement cartbutton;
	@FindBy(xpath = "//span[@id='cart-total']") private WebElement carttotal;
	@FindBy(xpath = "//strong[normalize-space()='View Cart']") private WebElement viewcart;
	@FindBy(xpath = "//a[normalize-space()='Estimate Shipping & Taxes']") private WebElement EstimateShippingTaxes;
	@FindBy(xpath = "//select[@id='input-country']") private WebElement inputcountry;
	@FindBy(xpath = "//select[@id='input-zone']") private WebElement inputzone;
	@FindBy(xpath = "//input[@id='input-postcode']") private WebElement inputpostcode;
	@FindBy(xpath = "//button[@id='button-quote']") private WebElement buttonquote;
	@FindBy(xpath = "//input[@name='shipping_method']") private WebElement shippingradioButton;
	@FindBy(xpath = "//input[@id='button-shipping']") private WebElement applyshippingbutton;
	@FindBy(xpath = "//a[@class='btn btn-primary' and .='Checkout']") private WebElement checkoutbutton;
	//@FindBy(xpath ="/html[1]/body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]") private WebElement productelement;
	//*[@id="input-country"]/option[.='India']
	////div[@class='alert alert-success alert-dismissible']
//	public WebElement getProductelement() {
//		return productelement;
//	}

	public  OrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getCartbutton() {
		return cartbutton;
	}

	public WebElement getCarttotal() {
		return carttotal;
	}

	public WebElement getViewcart() {
		return viewcart;
	}

	public WebElement getEstimateShippingTaxes() {
		return EstimateShippingTaxes;
	}

	public WebElement getInputcountry() {
		return inputcountry;
	}

	public WebElement getInputzone() {
		return inputzone;
	}

	public WebElement getInputpostcode() {
		return inputpostcode;
	}

	public WebElement getButtonquote() {
		return buttonquote;
	}

	public WebElement getShippingradioButton() {
		return shippingradioButton;
	}

	public WebElement getApplyshippingbutton() {
		return applyshippingbutton;
	}

	public WebElement getCheckoutbutton() {
		return checkoutbutton;
	}
	

	//action methods 
	public void clickoncart(WebElement element)
	{
		element.click();
	}
	public void enterPineCode(String pinecode)
	{
		inputpostcode.sendKeys(pinecode);
	}
//	public String Productdetails()
//	{
//		return productelement.getText();
//	}
	
	//action proccess methods
	public void orderPageProcess(int Country, String State, String PineCode)
	{
		cartbutton.click();
		carttotal.click();//clickoncart(carttotal);
		viewcart.click();//clickoncart(viewcart);
		EstimateShippingTaxes.click();//clickoncart(EstimateShippingTaxes);
		inputcountry.click();
		ActionClass action = new ActionClass();
		action.selectTheOption( inputcountry,Country);
		action.selectTheOption(inputzone,State );
		enterPineCode(PineCode);
		buttonquote.click();//clickoncart(buttonquote);
		shippingradioButton.click();//clickoncart(shippingradioButton);
		applyshippingbutton.click();//clickoncart(applyshippingbutton);
		
		boolean staleElement = true; 

		while(staleElement){

		  try{

		     
			  checkoutbutton.click();
		     staleElement = false;


		  } catch(StaleElementReferenceException e){

		    staleElement = true;

		  }

		}
		//clickoncart(checkoutbutton);
		//System.out.println("Your product "+Productdetails()+" is bbooked now");
	}
}
