package com.OrangeHrm.Generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import com.OrangeHrm.ElementRepository.LoginPage;
import com.OrangeHrm.ElementRepository.Logout;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class BasePage implements ApplicationConstants {
	public WebDriver driver;
	public WebDriverWait ww;
	ReadProperty p;
	public ExtentReports er;
	public ExtentTest execution;
	
	@BeforeTest
	public void ReportConfig()
	{
		er = new ExtentReports(Extendreports_path);
	}
	
	@BeforeClass
	public void openBrowser() throws Exception
	{
		System.setProperty(chrome_key, chrome_path);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(timeout,TimeUnit.SECONDS);
		ww=new WebDriverWait(driver, timeout);
		p= new ReadProperty();
		driver.get(p.url());
	}
	
	@BeforeMethod
	public void login()
	{
		LoginPage lp = new LoginPage(driver);
		lp.username().sendKeys(p.username());
		lp.password().sendKeys(p.password());
		lp.clicklogin().click();
	}
	
	@AfterMethod
	public void logout(ITestResult result) throws Exception
	{
		
		execution=er.startTest(result.getName());
		if(result.getStatus()==ITestResult.FAILURE)
		{
			execution.log(LogStatus.FAIL,"Test case is failed");
			CaptureDefects.getDefects(driver, result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			execution.log(LogStatus.PASS,"Test case is pass");
			CaptureDefects.getDefects(driver, result.getName());
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			execution.log(LogStatus.SKIP,"Test case is skipped");
			CaptureDefects.getDefects(driver, result.getName());
		}
		er.endTest(execution);
		
		Logout lo = new Logout(driver);
		lo.clickOnProfile().click();
		lo.clickLogout().click();
		Thread.sleep(1000);
		
//		
	}
	
	@AfterClass
	public void quitBrowser()
	{
		driver.quit();
	}
	
	@AfterTest
	public void ReportClosure()
	{
		er.flush();
	}
	/*
	@Test
	public void TestCase()
	{
		System.out.println("executing");
	}
	*/
	
	

}
