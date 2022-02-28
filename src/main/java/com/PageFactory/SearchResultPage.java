/**
 * 
 */
package com.PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Vaibhav Garse
 *
 */
public class SearchResultPage {

	@FindBy(xpath = "//a[normalize-space()='Your Store']") private WebElement yourstoreLogo;
	@FindBy(xpath = "//input[@placeholder='Search']") private WebElement searchbox;
	@FindBy(xpath = "//i[@class='fa fa-search']") private WebElement searchbutton;
	@FindBy(xpath = "//div[@class='product-layout product-grid col-lg-3 col-md-3 col-sm-6 col-xs-12']//button[1]") private WebElement addtocart;
	@FindBy(xpath = "//body/div[@id='product-search']/div[@class='row']/div[@id='content']/div[3]") private WebElement results;
	public SearchResultPage(WebDriver driver) {
	
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getResults() {
		return results;
	}


	public WebElement getYourstoreLogo() {
		return yourstoreLogo;
	}


	public WebElement getSearchbox() {
		return searchbox;
	}


	public WebElement getAddtocart() {
		return addtocart;
	}


	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	public void SearchResult(String ProductName)
	{
		searchbox.sendKeys(ProductName);
	}
	
	public void Clickelement() {
		// TODO Auto-generated method stub
		searchbutton.click();
	}
	public void clickonaddtocart()
	{
		addtocart.click();
	}
	
	//action methods
	public void doClick(WebElement clickelement)
	{
		clickelement.click();
	}
	public void sendKeys(WebElement sendelement, CharSequence SendText)
	{
		sendelement.sendKeys(SendText);
		
	}
	public String getText(WebElement textelement)
	{
		return textelement.getText();
	}
	public void getTitle(WebDriver driver)
	{
		driver.getTitle();
	}
	//Process Method
	public void SearchResult1(String Productname) throws InterruptedException
	{
		System.out.println("Page Tittle is : " +getText(yourstoreLogo));
		sendKeys(searchbox, Productname);
		Thread.sleep(2000);
		doClick(searchbutton);
		System.out.println("Product Serached By "+Productname+" This Name ");
		clickonaddtocart();
		System.out.println("Product Name & details :"+getText(results));
		Thread.sleep(2000);
		
		
	}
}
