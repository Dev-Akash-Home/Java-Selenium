package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsScrollBarDemo {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
		
	    // Scroll down page
	 //   js.executeScript("window.scrollBy(0,3000)","");
	    
	 //   System.out.println(js.executeScript("return window.pageYOffset;"));
	    
	 // Scroll down page until the particular element is visible
//	   WebElement wb = driver.findElement(By.xpath("//img[@alt='Flag of Brazil']"));
	    
//	    js.executeScript("arguments[0].scrollIntoView();",wb);
	    
//	    System.out.println(js.executeScript("return window.pageYOffset;")); 
	    
	    // Scroll page till the end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	    
        System.out.println(js.executeScript("return window.pageYOffset;"));
			
	    Thread.sleep(2000);
	    
	   // Scroll up the page 
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	    
        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        Thread.sleep(3000);
			
	    driver.quit();
	}

}
