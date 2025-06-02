package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        
     //   ChromeDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement ip = driver.findElement(By.xpath("//input[@id='name']"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // Because of webdriver interface typecasting is required
		
	//	JavascriptExecutor js = driver;
		
		// alternate of sendkeys and click method using jsexecuter
		js.executeScript("arguments[0].setAttribute('value','Akash')",ip);
		
		WebElement rdbtn = driver.findElement(By.xpath("//input[@id='male']"));
		
		js.executeScript("arguments[0].click()",rdbtn);
		
	    Thread.sleep(3000);

		driver.quit();
	}

}
