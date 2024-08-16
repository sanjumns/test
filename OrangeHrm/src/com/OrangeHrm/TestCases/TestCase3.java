package com.OrangeHrm.TestCases;

import org.testng.annotations.Test;

import com.OrangeHrm.ElementRepository.HomePage;
import com.OrangeHrm.Generic.BasePage;
import com.OrangeHrm.Generic.EmployeeData;

public class TestCase3 extends BasePage {
	
	@Test (dataProvider = "empdata", dataProviderClass = EmployeeData.class)
	public void addEmployee(String usn, String ln)
	{
		HomePage hp = new HomePage(driver);
		hp.pim().click();
		hp.addEmployee().click();
		hp.enterFirstName().sendKeys(usn);
		hp.enterLastName().sendKeys(ln);
	}

}
