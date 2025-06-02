package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDom {

	public static void main(String[] args) throws InterruptedException {
		
		// Xpath can't handle shadow dom
		// Only CSS can handle shadow dom
		
        WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://books-pwakit.appspot.com/");
		
		//This Element is inside single shadow DOM.
		//String cssSelectorForHost1 = "book-app[apptitle='BOOKS']";
		//Thread.sleep(1000);
		
		SearchContext shadow = driver.findElement(By.cssSelector("book-app[apptitle='BOOKS']")).getShadowRoot();
		Thread.sleep(1000);
		shadow.findElement(By.cssSelector("#input")).sendKeys("Welcome");
		
		Thread.sleep(3000);

		driver.quit();
	}

}
