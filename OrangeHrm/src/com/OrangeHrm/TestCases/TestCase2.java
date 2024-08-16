package com.OrangeHrm.TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.OrangeHrm.Generic.BasePage;

public class TestCase2 extends BasePage{
	
	@Test
	public void getUrl()
	{
		String url = driver.getCurrentUrl();
		Reporter.log(url);
		
	}

}
