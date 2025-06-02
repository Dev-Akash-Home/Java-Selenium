package com.pack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificWindow {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // apply only one time for all of the codes.
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	    driver.findElement(By.xpath("//a[normalize-space()=\"OrangeHRM, Inc\"]")).click();
	    
	    Set<String> windowIDs = driver.getWindowHandles();
	    
	    for(String winid:windowIDs) {
	    	String title = driver.switchTo().window(winid).getTitle();
	    	System.out.println(title);
	    	
	    	   if(title.equals("OrangeHRM")) {
	    		driver.close();
	       }
	    } 
	    
	    driver.quit();

	}

}
