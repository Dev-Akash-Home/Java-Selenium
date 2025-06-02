package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// find the total no rows
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); // multiple tables
		
		//int rows = driver.findElements(By.tagName("tr")).size();  // single table
		
		System.out.println("Total no Rows : "+ rows);
		
		// find the total no columns
		int cols = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();// multiple tables
		
		//int cols = driver.findElements(By.tagName("th")).size();  // single table
		
		System.out.println("Total no Cloumns : "+ cols);
		
		System.out.println("***************************************************************");
		
		// Read data from specific row and column
		String bookname = driver.findElement(By.xpath("//table[@name='BookTable']//tr[7]//td[3]")).getText();
		
		System.out.println(bookname);
		
		System.out.println("***************************************************************");
		
		// read all the data from table
		for(int i=2;i<=rows;i++) {
			
			for(int j=1;j<=cols;j++) {
				
				String value = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td["+j+"]")).getText();
				System.out.print(value+" ");
			}
			System.out.println();
		}
		
		System.out.println("***************************************************************");
		
		// Print book name using author name
		for(int i=2;i<=rows;i++) { 
			
			String author = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[2]")).getText();
			
			if(author.equals("Amit")) {
				
				String book = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[1]")).getText();
				
				String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
				
				System.out.println(author+" "+book+" "+price);
			}
		}
		
		System.out.println("***************************************************************");
		
		// Total Price of the book
		int Total=0;
		for(int i=2;i<=rows;i++) { 
			String price = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]//td[4]")).getText();
			Total = Total + Integer.parseInt(price); 
		}
		
		System.out.println("Total no of Price : "+Total);
		
		driver.quit();
	}

}
