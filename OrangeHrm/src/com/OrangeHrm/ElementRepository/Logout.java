package com.OrangeHrm.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	public WebElement profile;
	
	@FindBy(xpath = "//a[text()='Logout']")
	public WebElement logout;
	
	public Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public WebElement clickOnProfile()
	{
		return profile;
	}
	
	public WebElement clickLogout()
	{
		return logout;
	}
	

}
