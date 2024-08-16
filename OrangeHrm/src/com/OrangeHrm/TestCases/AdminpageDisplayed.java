package com.OrangeHrm.TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OrangeHrm.ElementRepository.HomePage;
import com.OrangeHrm.Generic.BasePage;

public class AdminpageDisplayed extends BasePage  {
	
	@Test
	public void AdminDisplay()
	{
		HomePage hp=new HomePage(driver);
		hp.clickAdmin().click();
		Reporter.log("Admin page displayed");
	}

}
