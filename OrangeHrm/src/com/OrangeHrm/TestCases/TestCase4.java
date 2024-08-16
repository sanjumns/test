package com.OrangeHrm.TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import com.OrangeHrm.ElementRepository.HomePage;
import com.OrangeHrm.Generic.BasePage;
import com.OrangeHrm.Generic.ReadExcel;

public class TestCase4 extends BasePage {
//	WebDriverWait dw= new WebDriverWait(driver, 10);
	ReadExcel re= new ReadExcel();
	int last=re.lastrow;
	int n;
	int i;
	@Test
	public void addEmployee() throws Exception
	{ 
		HomePage hp=new HomePage(driver);
//		for(int i=0; i< last; i++)
//		{
//			
			while(n<=last)
			{
				int j=0;
				ww.until(ExpectedConditions.elementToBeClickable(hp.pim()));
				hp.pim().click();
				ww.until(ExpectedConditions.elementToBeClickable(hp.addEmployee()));
				hp.addEmployee().click();
				hp.enterFirstName().sendKeys(re.book.getSheet("Sheet1").getRow(i).getCell(j++).getStringCellValue());
				hp.enterLastName().sendKeys(re.book.getSheet("Sheet1").getRow(i++).getCell(j).getStringCellValue());
				hp.savebutton().click();
				n++;
//				j=0;
				Thread.sleep(3000);
//				hp.pim().click();
				addEmployee();
			}
//		}
//		
////		
	}

}
