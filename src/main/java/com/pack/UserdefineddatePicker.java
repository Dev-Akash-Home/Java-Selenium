package com.pack;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserdefineddatePicker {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://jqueryui.com/datepicker/");
		
		Thread.sleep(3000);
		
		// Switch Frame
		driver.switchTo().frame(0);
		
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String date = sc.nextLine();
		
		// Method 1
		WebElement datePicker = driver.findElement(By.xpath("//input[@class='hasDatepicker']")); // Format wise
		
		datePicker.sendKeys(date);
		
		String month = null;
		String year = null;

		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();

			// Future Date
/*			while(true) {
				// Month
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				// Year
				String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(currentMonth.equals(month) && currentYear.equals(year)) {
					
					break;
				}
					
			    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next

			}
			
			// capturing dates
			List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
			
			for(WebElement dt:allDates) {
				
				if(dt.getText().equals(date)) {
					dt.click();
					break;
				}
			}*/
			
			
			// Past date
			while(true) {
				// Month
				String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
				
				// Year
				String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
				
				if(currentMonth.equals(month) && currentYear.equals(year)) {
					
					break;
				}
				
	        	driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous

			}		
		
		// capturing dates
		List<WebElement> allDates1 = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates1) {
			
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
		sc.close();
		
		Thread.sleep(3000);
		
		driver.quit();


	}

}
