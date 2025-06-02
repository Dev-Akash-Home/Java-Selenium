package com.pack;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataWrite {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\Testing.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("Data");
		
		XSSFRow row1 = sheet.createRow(0);
		   row1.createCell(0).setCellValue("Java");
		   row1.createCell(1).setCellValue("8461311");
		   row1.createCell(2).setCellValue("Automation");
		   row1.createCell(3).setCellValue("28-10-1996");
		   
		XSSFRow row2 = sheet.createRow(1);
		   row2.createCell(0).setCellValue("Python");
		   row2.createCell(1).setCellValue("7945131");
		   row2.createCell(2).setCellValue("Manual");
		   row2.createCell(3).setCellValue("10-10-1986");		
			 
		XSSFRow row3 = sheet.createRow(2);
		   row3.createCell(0).setCellValue("Ruby");
		   row3.createCell(1).setCellValue("32214");
		   row3.createCell(2).setCellValue("Functional");
		   row3.createCell(3).setCellValue("08-10-1776");
		
		// Connecting workbook to file   
	    wb.write(file);
	    
	    wb.close();
	    file.close();
	    
	    System.out.println("File is created..............");
	}

}
