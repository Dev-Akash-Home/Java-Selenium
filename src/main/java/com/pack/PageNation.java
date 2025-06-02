package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageNation {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://demo.opencart.com/admin/index.php");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='input-username']"));
		username.clear();
		username.sendKeys("demo");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='input-password']"));
		password.clear();
		password.sendKeys("demo");
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		
		// popup window close
		if(driver.findElement(By.xpath("//button[@class='btn-close']")).isDisplayed()) {
			
			driver.findElement(By.xpath("//button[@class='btn-close']")).click();
		}
		
		// Title
		WebElement title = driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']"));
		System.out.println("The title of the Page is : "+ title);
		
		// Customer Dropdown
		driver.findElement(By.xpath("//a[@class='parent collapsed'][normalize-space()='Customers']")).click(); // main menu
		
		driver.findElement(By.xpath("//ul[@id='collapse-5']//a[contains(text(),'Customers')]")).click(); // sub menu
		
		// Total page and Page count
		String text = driver.findElement(By.xpath("//div[contains(text(),'Pages')]")).getText();
		System.out.println(text);
		
		int total_pages = Integer.parseInt(text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1));
		
		// Dynamic page count
		for(int p=1;p<=total_pages;p++) {
			
			if(p>1) {
				WebElement active_page = driver.findElement(By.xpath("//ul[@class='pagination']//*[text()="+p+"]"));
				active_page.click();
			}
		}
		
		// Table data
		
		int noOfRows = driver.findElements(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr")).size();
		
		for(int r=1;r<=noOfRows;r++) {
			String CustomerName = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr["+r+"]//td[2]")).getText();
			String EmailAddress = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[1]//td[3]")).getText();
			String Status = driver.findElement(By.xpath("//table[@class='table table-bordered table-hover']//tbody//tr[1]//td[5]")).getText();
			
			System.out.println(CustomerName+" "+EmailAddress+" "+Status);
			
		}
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
