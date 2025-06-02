package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_Demo {

	public static void main(String[] args) {
		
	    //ChromeOptions options = new ChromeOptions();
	   //options.addArguments("--remote-allow-origins=*");   Socket issue
       
	   //ChromeDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		
		String act_title = driver.getTitle();
		
		if (act_title.equals("Your Store")) {
			
			System.out.println("Passed");
		}
		
		else {
			
			System.out.println("Failed");
		}
		
		//driver.close();
		driver.quit();
		
	}

}
