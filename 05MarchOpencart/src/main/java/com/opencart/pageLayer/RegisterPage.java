package com.opencart.pageLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	private WebDriver driver;
	public RegisterPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	//-------- Obje repo -----------------------------------
	@FindBy(xpath="//input[@id='input-firstname']")
	private WebElement firstname_txtbox;
	
	@FindBy(xpath="//input[@id='input-lastname']")
	private WebElement lastname_txtbox;
	
	@FindBy(xpath="//input[@id='input-email']")
	private WebElement email_txtbox;
	
	@FindBy(xpath="//input[@id='input-telephone']")
	private WebElement telephone_txtbox;
	
	@FindBy(xpath="//input[@id='input-password']")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//input[@id='input-confirm']")
	private WebElement confirm_password_txtbox;
	
	@FindBy(xpath="//input[@name='agree']")
	private WebElement privacy_policy_checkbox;
	
	@FindBy(xpath="//input[@class='btn btn-primary']")
	private WebElement continue_btn;
	
	//-------- action methods-------------------------------
	public void enterFirstName(String firstname)
	{
		firstname_txtbox.sendKeys(firstname);
	}
	
	public void enterLastName(String lastname)
	{
		lastname_txtbox.sendKeys(lastname);
	}
	
	public void enterEmailID(String email)
	{
		email_txtbox.sendKeys(email);
	}
	
	public void enterTelephone(String tele)
	{
		telephone_txtbox.sendKeys(tele);
	}
	
	public void enterPassword(String password)
	{
		password_txtbox.sendKeys(password);
	}
	
	public void enterConfirmPassword(String cpassword)
	{
		confirm_password_txtbox.sendKeys(cpassword);
	}
	
	public void clickOnPrivayPolicy()
	{
		privacy_policy_checkbox.click();
	}
	
	public void clickOnContinueButton()
	{
		continue_btn.click();
	}
}
