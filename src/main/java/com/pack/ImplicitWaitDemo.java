package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // apply only one time for all of the codes.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    driver.findElement(By.xpath("//input[@placeholder=\"Username\"]")).sendKeys("Admin");

		driver.quit();
	}

}
