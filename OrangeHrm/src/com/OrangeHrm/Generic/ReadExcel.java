package com.OrangeHrm.Generic;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcel implements ApplicationConstants {
	
	public String fn;
	String ln;
	public int lastrow;
	public Workbook book;
	FileInputStream fis;
	public ReadExcel() 
//	static String data;
//	public  void readExcelData() throws Exception
//	public static void main(String[] args) throws Exception, Exception {
	{
//		ReadExcel re= new ReadExcel();
		try {
			fis = new FileInputStream("./Property/empdata.xlsx");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			book= WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		String text = re.book.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(text);
//		Cell cel = book.getSheet("sheet1").getRow(CellValue).getCell(CellValue);
//		String fn = cel.getStringCellValue();
//		fn = book.getSheet("Sheet1").getRow(i).getCell(j).getStringCellValue();
//		ln = book.getSheet("Sheet1").getRow(i).getCell(j+1).getStringCellValue();
		lastrow =book.getSheet("Sheet1").getLastRowNum();
		
//		return book ;
				
		
	}
	}
	
