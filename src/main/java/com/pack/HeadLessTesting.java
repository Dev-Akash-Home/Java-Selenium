package com.pack;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadLessTesting {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--headless=new"); // settings for headless mode of execution

		WebDriver driver = new ChromeDriver(options);
		 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	    
	    String title = driver.getTitle();
	    
//	    System.out.println("The tile is : "+title);
	    
	    if(title.equals("Multiple File Upload Input Example")) {
	    	System.out.println("Title Matched.....");
	    }
	    else {
	    	System.out.println("Title not Matched.....");
	    }
	    
	    Thread.sleep(3000);
	    
        driver.quit();
	}

}
