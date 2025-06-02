package com.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepicker {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://jqueryui.com/datepicker/");
		
		Thread.sleep(3000);
		
		// Switch Frame
		driver.switchTo().frame(0);
		
		// Method 1
	//	driver.findElement(By.xpath("//input[@class='hasDatepicker']")).sendKeys("04/04/2004"); // Format wise
		
		// Method 2
		String year = "2026";
		String month = "October";
		String date = "28";
		
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();

		while(true) {
			// Month
			String currentMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			
			// Year
			String currentYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year)) {
				
				break;
			}
				
		    driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); // Next
			
	//		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); // Previous

		}
		
		// capturing dates
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement dt:allDates) {
			
			if(dt.getText().equals(date)) {
				dt.click();
				break;
			}
		}
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
