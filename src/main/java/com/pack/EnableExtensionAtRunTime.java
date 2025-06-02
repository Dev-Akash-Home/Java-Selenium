package com.pack;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class EnableExtensionAtRunTime {

	public static void main(String[] args) {

        ChromeOptions options = new ChromeOptions();
        
        File fl =new File("D:\\IMAGES\\Eclipse\\Selenium_MVN\\CRX\\SelectorsHub-XPath-Helper-Chrome-Web-Store.crx");
        
        options.addExtensions(fl); // Need to Add CRX extension in chrome to run the test

		WebDriver driver = new ChromeDriver(options);
		 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://text-compare.com/");

	    driver.quit();
	}

}
