package com.pack;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsZoomInZoomOut {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
	    
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    
	    js.executeScript("document.body.style.zoom='50%'");
        
	    Thread.sleep(3000);
	    
	    driver.quit();
	}

}
