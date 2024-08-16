package com.OrangeHrm.Generic;



import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class CaptureDefects implements ApplicationConstants
{
	public static void getDefects(WebDriver driver, String Name)
	{
		Date d= new Date();
		String date=d.toString().replace(":", "-");
		TakesScreenshot ts= (TakesScreenshot)driver;
		File temp=ts.getScreenshotAs(OutputType.FILE);
		File perm = new File(screenshot_path+date+""+Name+".jpg");
	}
	

}
