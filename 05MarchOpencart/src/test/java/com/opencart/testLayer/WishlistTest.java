package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.pageLayer.ProductPage;
import com.opencart.pageLayer.WishListPage;
import com.opencart.testBase.TestBase;

public class WishlistTest extends TestBase {
	
	@Test
	public void ValidateaddingProducttoWishListpage()
	{
		HomePage homepage_obj = new HomePage(driver);
		LoginPage loginPage_obj = new LoginPage(driver);
		ProductPage product_obj = new ProductPage(driver);
		WishListPage wishlist_obj = new WishListPage(driver);
	
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnLoginLink();
		loginPage_obj.enterEmailID("davidw1@gmail.com");
		loginPage_obj.enterPassword("Test@1234");
		loginPage_obj.clickOnLoginButton();
		
		homepage_obj.clickOnHomePageLogo();
		homepage_obj.clickOniPhoneProductLink();
		product_obj.clickOnWishlistIcon();
		homepage_obj.clickOnWishListLink();
		
		Assert.assertEquals(wishlist_obj.getProductName(), "iPhone");
	}

}
