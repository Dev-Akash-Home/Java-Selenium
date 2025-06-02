package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WaitMethod {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(2000);
		 // Implicit Wait and Explicit Wait / Fluent Wait
		//NoSuchElementException : Element is not present on the page. Synchronization.
		//ElementNotFoundException : Locator is in-correct
		
		driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");
		
		driver.quit();
	}

}
