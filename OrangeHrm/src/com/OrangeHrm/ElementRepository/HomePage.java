package com.OrangeHrm.ElementRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement admin;
	
	@FindBy(xpath = "//a[@href='/web/index.php/pim/viewPimModule']")
	private WebElement pim;
	
	@FindBy (xpath = "//a[text()='Add Employee']")
	private WebElement addEmp;
	
	@FindBy (xpath = "//input[@name='firstName']")
	private WebElement fntf;
	
	@FindBy(xpath = "//input[@name='lastName']")
	private WebElement lntf;
	
	@FindBy (xpath = "//button[@type='submit']")
	private WebElement save;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement clickAdmin()
	{
		return admin;
	}
	
	public WebElement pim()
	{
		return pim;
	}
	
	public WebElement addEmployee()
	{
		return addEmp;
	}
	
	public WebElement enterFirstName()
	{
		return fntf;
	}
	
	public WebElement enterLastName()
	{
		return lntf;
	}
	
	public WebElement savebutton()
	{
		return save;
	}


}
