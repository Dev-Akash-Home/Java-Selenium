package com.pack;

import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {

	public static void main(String[] args) throws Throwable {

        WebDriver driver = new ChromeDriver();
        
        //driver.get("https://demo.nopcommerce.com");  accept url only in String format
		
		//driver.navigate().to("https://demo.nopcommerce.com");  accept url in String and object format
        
		//@SuppressWarnings("deprecation")
		//URL myurl = new URL("https://demo.nopcommerce.com");   // Object format
       //driver.navigate().to(myurl);
        
        driver.get("https://demo.nopcommerce.com");
        driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());  // Backward
        
        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());  // Forward
        
        driver.navigate().refresh();
		
        driver.quit();
	}

}
