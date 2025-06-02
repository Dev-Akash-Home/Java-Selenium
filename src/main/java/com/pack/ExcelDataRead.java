package com.pack;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataRead {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\Book.xlsx");
		
		// Excel File --> WorkBook --> Sheets --> Rows --> Cells
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
	//	XSSFSheet sheet = workbook.getSheet("Book");    Need to check not working
	    XSSFSheet sheet = workbook.getSheetAt(0);
		
		int totalRow = sheet.getLastRowNum();
		
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("The no of total Rows : "+ totalRow);
		
		System.out.println(" The no of total cells : "+ totalCells);
		
		for(int i=0;i<=totalRow;i++) {
			
			XSSFRow currentRow = sheet.getRow(i);
			
			for (int j=0;j<totalCells;j++) {
				
				XSSFCell currentCell = currentRow.getCell(j);
			    System.out.print(currentCell.toString()+" ");			
			}
			System.out.println();
		}
		workbook.close();
		
		file.close();
	}

}
