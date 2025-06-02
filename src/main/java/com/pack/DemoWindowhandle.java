package com.pack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWindowhandle {

	public static void main(String[] args) {
		
		 WebDriver driver = new ChromeDriver();
	        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // apply only one time for all of the codes.
			
			driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
			
		    driver.findElement(By.xpath("//a[normalize-space()=\"OrangeHRM, Inc\"]")).click();
		    
		    Set<String> windowIDs = driver.getWindowHandles(); // Set method does not have Get method so we can't ids individually
		                                // that's why we convert set method to List method
		    /*  Approach 1
		    List<String> windowList = new ArrayList<String>(windowIDs); // List method so we can ids individually
		    String parentID = windowList.get(0);
		    String childID = windowList.get(1);
		    
		    //switch to child window
		    driver.switchTo().window(childID);
		    System.out.println(driver.getTitle());
		    
		  //switch to parent window
		    driver.switchTo().window(parentID);
		    System.out.println(driver.getTitle());  */
		    
		    // Approach 2
		    for (String winID:windowIDs) {
		    	String title = driver.switchTo().window(winID).getTitle();
		    	
		    	if(title.equals("OrangeHRM")) {
		    		System.out.println(driver.getCurrentUrl());
		    	}
		    }

			driver.quit();

	}

}
