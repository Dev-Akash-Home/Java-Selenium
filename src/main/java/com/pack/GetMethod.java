package com.pack;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {   // it will work on Page level not web elements except getText() method

	public static void main(String[] args) throws Throwable {
		
		 WebDriver driver = new ChromeDriver();
			
		 driver.get("https://flipkart.com/");
		 Thread.sleep(2000);
		 
		 System.out.println(driver.getTitle());  // return the title of the webpage
		 
		 System.out.println(driver.getCurrentUrl());  // return the url of the webpage
		 
		 //System.out.println(driver.getPageSource());  // return the source of the webpage
		 
		 //String windowID = driver.getWindowHandle();
		 //System.out.println("Window ID : "+ windowID);  // return id of the single browser window
		 
		 driver.findElement(By.linkText("Contact Us")).click();  // trying to capture multiple id's
		 
		 Set<String> windowIDs = driver.getWindowHandles(); // set does not return duplicate like list
		 System.out.println("Window IDs : "+ windowIDs);  // return id's of the multiple browser window
		 
		 driver.quit();
	}

}
