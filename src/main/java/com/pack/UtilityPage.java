package com.pack;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class UtilityPage {
	
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet sh;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle cs;

	
	public static int getRowCount(String XlFilePath, String XlSheetName) throws IOException 
	{
	    fi = new FileInputStream(XlFilePath);	
	    wb = new XSSFWorkbook(fi);
	    sh = wb.getSheet(XlSheetName);
	    int rowCount = sh.getLastRowNum();
	    wb.close();
	    fi.close();
		return rowCount;	
	}
	
	public static int getCellCount(String XlFilePath, String XlSheetName, int rownum) throws IOException 
	{
	    fi = new FileInputStream(XlFilePath);	
	    wb = new XSSFWorkbook(fi);
	    sh = wb.getSheet(XlSheetName);
	    row = sh.getRow(rownum);
	    int cellCount = row.getLastCellNum();
	    wb.close();
	    fi.close();
		return cellCount;	
	}
	
	public static String getCellData(String XlFilePath, String XlSheetName, int rownum, int colnum) throws IOException 
	{
	    fi = new FileInputStream(XlFilePath);	
	    wb = new XSSFWorkbook(fi);
	    sh = wb.getSheet(XlSheetName);
	    row = sh.getRow(rownum);
	    cell = row.getCell(colnum);
	    
	    String data;
	    try {
	    	
	    //	data = cell.toString();
	    	
	    	//    OR
	    	
	    	// provided by apache ui
	    	DataFormatter df = new DataFormatter();
	    	data = df.formatCellValue(cell); // return formatted  values of cell as string regardless of the cell type
	    }
	    catch(Exception e) {
	    	data = "";
	    }
	    
	    wb.close();
	    fi.close();
		return data;	
	}
	
	public static void setCellData(String XlFilePath, String XlSheetName, int rownum, int colnum, String data) throws IOException 
	{
		// Read data from Excel
		fi = new FileInputStream(XlFilePath);
		wb = new XSSFWorkbook(fi);
		sh = wb.getSheet(XlSheetName);
		row = sh.getRow(rownum);
		
		// Write data from Excel
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(XlSheetName);
		wb.write(fo);
		
		wb.close();
		fi.close();
		fo.close();
	}
	
	public static void fillGreenColour(String XlFilePath, String XlSheetName, int rownum, int colnum) throws IOException 
	{
		try {
	    fi = new FileInputStream(XlFilePath);	
	    wb = new XSSFWorkbook(fi);
	    sh = wb.getSheet(XlSheetName);
	    row = sh.getRow(rownum);
	    cell = row.getCell(colnum);
	    
	    // Style
	    cs = wb.createCellStyle();
	    
	    cs.setFillForegroundColor(IndexedColors.GREEN.getIndex());
	    cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    
	    cell.setCellStyle(cs);

	    fo = new FileOutputStream(XlSheetName);
	    wb.write(fo);
	    
	    wb.close();
	    fi.close();
		fo.close();	
		}
		catch(Exception e) {
			//System.out.println("Style is not applied for some reason");
		}
	}
	
	public static void fillRedColour(String XlFilePath, String XlSheetName, int rownum, int colnum) throws IOException 
	{
		try {
	    fi = new FileInputStream(XlFilePath);	
	    wb = new XSSFWorkbook(fi);
	    sh = wb.getSheet(XlSheetName);
	    row = sh.getRow(rownum);
	    cell = row.getCell(colnum);
	    
	    // Style
	    cs = wb.createCellStyle();
	    
	    cs.setFillForegroundColor(IndexedColors.RED.getIndex());
	    cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
	    
	    cell.setCellStyle(cs);

	    fo = new FileOutputStream(XlSheetName);
	    wb.write(fo);
	    
	    wb.close();
	    fi.close();
		fo.close();	
		}
		catch(Exception e) {
			//System.out.println("Style is not applied for some reason");
		}
	}
  }