package com.pack;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDaynamicDataWrite {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream file = new FileOutputStream(System.getProperty("user.dir")+"\\TestData\\DynamicData.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook();
		
		XSSFSheet sheet = wb.createSheet("DynamicData");

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of rows : ");
		int noOfRows = sc.nextInt();
		
		System.out.println("Enter the no of cells : ");
		int noOfCells = sc.nextInt();
		
		for(int i=0;i<=noOfRows;i++) {
			
			XSSFRow currentRow = sheet.createRow(i);
			
			for(int j=0;j<noOfCells;j++) {
				
				 XSSFCell cell = currentRow.createCell(j);
				 
				 cell.setCellValue(sc.next());
		}
	}
		// Connecting workbook to file   
	    wb.write(file);
	    
	    wb.close();
	    file.close();
	    
	    System.out.println("File is created..............");
  }
}
