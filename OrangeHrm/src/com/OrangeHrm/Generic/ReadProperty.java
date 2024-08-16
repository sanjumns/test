package com.OrangeHrm.Generic;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadProperty {
	Properties p;
	
	public ReadProperty() throws Exception
	{
		p=new Properties();
		FileInputStream fis =new FileInputStream("./Property/TestData.properties");
		p.load(fis);
		
	}
	
	public String url()
	{
		String url = p.getProperty("testurl");
		return url;
	
	}
	
	public String username()
	{
		String usn=p.getProperty("usn");
		return usn;
		
	}
	
	public String password()
	{
		String psw=p.getProperty("psw");
		return psw;
		
	}

}
