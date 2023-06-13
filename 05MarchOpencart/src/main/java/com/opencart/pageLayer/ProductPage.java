package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	private WebDriver driver;
	public ProductPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	//-------- Obje repo -----------------------------------
	@FindBy(xpath="//button[@class='btn btn-default']")
	private WebElement wishlist_icon;
	
	
	public void clickOnWishlistIcon()
	{
		wishlist_icon.click();
	}
}
