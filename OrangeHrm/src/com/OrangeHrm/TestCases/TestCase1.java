package com.OrangeHrm.TestCases;

import java.util.concurrent.TimeUnit;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OrangeHrm.Generic.BasePage;

public class TestCase1 extends BasePage
{
	@Test
	public void title()
	{
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
		String title = driver.getTitle();
		Reporter.log(title);
	
	}
	
	

}
