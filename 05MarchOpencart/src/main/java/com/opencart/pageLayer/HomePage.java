package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	private WebDriver driver;
	public HomePage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	//-------- Obje repo -----------------------------------
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	private WebElement my_account_dropdown;
	
	@FindBy(xpath="//a[contains(text(),'Register')]")
	private WebElement register_link;
	
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement login_link;
	
	@FindBy(xpath="(//a[text()='iPhone'])[2]")
	private WebElement iPhone_product_link;
	
	@FindBy(xpath="//div[@id='logo']")
	private WebElement homepage_logo;
	
	@FindBy(xpath="//a[@id='wishlist-total']")
	private WebElement wishlist_link;
	
	//-------- action methods-------------------------------
	public void clickOnMyAccountDropDown()
	{
		my_account_dropdown.click();
	}
	
	public void clickOnRegisterLink()
	{
		register_link.click();
	}
	
	public void clickOnLoginLink()
	{
		login_link.click();
	}
	
	public void clickOniPhoneProductLink()
	{
		iPhone_product_link.click();
	}
	
	public void clickOnHomePageLogo()
	{
		homepage_logo.click();
	}
	
	public void clickOnWishListLink()
	{
		wishlist_link.click();
	}
	
}
