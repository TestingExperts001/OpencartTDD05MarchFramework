package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.RegisterPage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class RegisterTest extends TestBase {
	
	
	@Test
	public void ValidateRegisteringAccountbyprovidingonlytheMandatoryfields()
	{
		String expected = "Your Account Has Been !";
		HomePage homepage_obj = new HomePage(driver);
		RegisterPage register_obj = new RegisterPage(driver);
		UtilClass util_obj = new UtilClass(driver);
		
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnRegisterLink();
		
		register_obj.enterFirstName("david");
		register_obj.enterLastName("W3");
		register_obj.enterEmailID("davidw3@gmail.com");
		register_obj.enterTelephone("985428454");
		register_obj.enterPassword("Test@1234");
		register_obj.enterConfirmPassword("Test@1234");
		register_obj.clickOnPrivayPolicy();
		register_obj.clickOnContinueButton();
		
		Assert.assertEquals(util_obj.getPageTitle(), expected);
	}

}
