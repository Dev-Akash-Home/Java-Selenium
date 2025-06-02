package com.pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium4NewWindowHandleCommand {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://demo.nopcommerce.com/");
		
		// New Tab in Same Browser
		//driver.switchTo().newWindow(WindowType.TAB);
		
		// New Window in Same Browser
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		driver.get("https://youtube.com");
		
		Thread.sleep(3000);
		
		driver.quit();
	}

}
