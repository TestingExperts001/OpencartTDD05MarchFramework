package com.opencart.testLayer;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.HomePage;
import com.opencart.pageLayer.LoginPage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.ExcelHandling;
import com.opencart.utilities.UtilClass;

public class LoginPageTest extends TestBase {

	@Test
	public void validateLoggingintotheApplicationUsingValidCredentials() throws IOException
	{
		ExcelHandling excel_data = new ExcelHandling();
		HomePage homepage_obj = new HomePage(driver);
		LoginPage loginPage_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass(driver);
		
		String expected_result = "My Account";
	
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnLoginLink();
		loginPage_obj.enterEmailID(excel_data.readData(1, 1, 0));
		loginPage_obj.enterPassword(excel_data.readData(1, 1, 1));
		loginPage_obj.clickOnLoginButton();
		
		Assert.assertEquals(util_obj.getPageTitle(), expected_result);	
	}
	

	@Test
	public void validateLoggingintotheApplicationUsingInValidCredentials()
	{
		HomePage homepage_obj = new HomePage(driver);
		LoginPage loginPage_obj = new LoginPage(driver);
		UtilClass util_obj = new UtilClass(driver);
		
		String expected_result = "Account Login";
	
		homepage_obj.clickOnMyAccountDropDown();
		homepage_obj.clickOnLoginLink();
		loginPage_obj.enterEmailID("davidw1@gmail.com");
		loginPage_obj.enterPassword("Test");
		loginPage_obj.clickOnLoginButton();
		
		Assert.assertEquals(util_obj.getPageTitle(), expected_result);	
	}
}
