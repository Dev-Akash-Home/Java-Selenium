package com.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPromt {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		driver.get("https://admin:admin@123@the-internet.herokuapp.com/basic_auth");
		Thread.sleep(5000);
		
        driver.quit();
	}

}
