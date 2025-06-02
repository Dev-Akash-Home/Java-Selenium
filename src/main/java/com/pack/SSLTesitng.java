package com.pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLTesitng {

	public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
		
		options.setAcceptInsecureCerts(true); // settings for SSL certificate

		WebDriver driver = new ChromeDriver(options);
		 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://expired.badssl.com/");
	    
        String title = driver.getTitle();
	    
	    System.out.println("The tile is : "+title);
	    
	    Thread.sleep(3000);
        
	    driver.quit();
	}

}
