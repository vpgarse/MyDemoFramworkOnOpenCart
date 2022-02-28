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
public class Homepage {
	
	//declaration
	@FindBy(xpath = "//a[normalize-space()='Your Store']") private WebElement yourstoreLogo; 
	@FindBy(xpath="//body//footer") private WebElement footer;
	@FindBy(xpath = "//button[@class='btn btn-inverse btn-block btn-lg dropdown-toggle']") private WebElement itembutton;
	@FindBy(xpath = "//div[@class='collapse navbar-collapse navbar-ex1-collapse']") private WebElement header;
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement serachbox;
	@FindBy(xpath = "//i[@class='fa fa-search']") private WebElement searchbutton;
	@FindBy(xpath = "//nav[@id='top']") private WebElement top;
	@FindBy(xpath = "//body/div[@id='common-home']/div[@class='row']/div[@id='content']/div[3]") private WebElement swipperviewerbrandsbottum;
	@FindBy(xpath = "//body/div[@id='common-home']/div[@class='row']/div[@id='content']/div[1]") private WebElement swipperviewerbrandsupper;
	@FindBy(xpath = "//div[@id='content']") private WebElement contain;
	@FindBy(xpath = "//i[@class='fa fa-user']") private WebElement myaccount;
	@FindBy(xpath = "//i[@class='fa fa-share']") private WebElement share;
	@FindBy(xpath = "//a[@title='Shopping Cart']//i[@class='fa fa-shopping-cart']") private WebElement shoppingcart;
	@FindBy(xpath = "//a[@id='wishlist-total']//i[@class='fa fa-heart']") private WebElement wishlist;
	@FindBy(xpath = "//i[@class='fa fa-phone']") private WebElement helpline;
	
	
	public  Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//utilization
	public WebElement getYourstoreLogo() {
		return yourstoreLogo;
	}


	public WebElement getFooter() {
		return footer;
	}


	public WebElement getItembutton() {
		return itembutton;
	}


	public WebElement getHeader() {
		return header;
	}


	public WebElement getSerachbox() {
		return serachbox;
	}


	public WebElement getSearchbutton() {
		return searchbutton;
	}


	public WebElement getTop() {
		return top;
	}


	public WebElement getSwipperviewerbrandsbottum() {
		return swipperviewerbrandsbottum;
	}


	public WebElement getSwipperviewerbrandsupper() {
		return swipperviewerbrandsupper;
	}


	public WebElement getContain() {
		return contain;
	}


	public WebElement getMyaccount() {
		return myaccount;
	}


	public WebElement getShare() {
		return share;
	}


	public WebElement getShoppingcart() {
		return shoppingcart;
	}


	public WebElement getWishlist() {
		return wishlist;
	}


	public WebElement getHelpline() {
		return helpline;
	}
	
	//Utilization or action methodes
	ActionClass action=new ActionClass();
	public String title()
	{
		return yourstoreLogo.getText();
	}
	public void homepageTitle()
	{
		action.verifyTheTitleOfTheWebpage("Your Store",title(), "Your Store");
	}
	public void doClick(WebElement Clickelement)
	{
		Clickelement.click();
	}
	public void myAccountClick()
	{
		doClick(myaccount);
	}

}
