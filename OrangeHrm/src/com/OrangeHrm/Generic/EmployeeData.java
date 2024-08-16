package com.OrangeHrm.Generic;

import org.testng.annotations.DataProvider;

public class EmployeeData {
	
	@DataProvider (name = "empdata")
			public Object[][] userData()
	{
		Object[][] data = new Object[2][2];
		data[0][0]="sanjay";
		data[0][1]="admin@123";
		data[1][0]="John";
		data[1][1]="Connor";
		return data;
		
	}

}
