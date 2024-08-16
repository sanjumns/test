package com.OrangeHrm.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement usn;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement psw;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginbutton;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement username()
	{
		return usn;
	}
	
	public WebElement password()
	{
		return psw;
	}
	
	public WebElement clicklogin()
	{
		return loginbutton;
	}

}
