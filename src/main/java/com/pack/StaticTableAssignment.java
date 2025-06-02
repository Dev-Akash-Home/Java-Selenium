package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTableAssignment {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://blazedemo.com/");
		
		driver.findElement(By.xpath("//option[@value='Mexico City']")).click();
		
		driver.findElement(By.xpath("//option[@value='Rome']")).click();
		
		driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
		Thread.sleep(5000);
		
		String Title = driver.findElement(By.xpath("//h3[normalize-space()='Flights from Mexico City to Rome:']")).getText();
		System.out.println(Title);
		
		System.out.println("***************************************************************");
		
		 // find the total no rows
		 int rows = driver.findElements(By.xpath("//table[@class='table']//tr")).size(); // multiple tables
				
	     System.out.println("Total no Rows : "+ rows);
				
		 // find the total no columns
		 int cols = driver.findElements(By.xpath("//table[@class='table']//th")).size();// multiple tables
				
		 System.out.println("Total no Cloumns : "+ cols);
				
		 System.out.println("***************************************************************");
		
		// lowest price
		 for(int i=1;i<=rows;i++) {
					
			String value = driver.findElement(By.xpath("//table[@class='table']//tr["+i+"]//td[6]")).getText();
			System.out.print(value+" ");
			System.out.println();
		 }	
		 
		driver.quit();		
	}

}
