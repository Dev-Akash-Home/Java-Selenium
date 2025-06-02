package com.pack;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ExtraKeyBoardAction {

	public static void main(String[] args) throws InterruptedException {
		
		
	        WebDriver driver = new ChromeDriver();
        
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
			driver.get("https://demo.nopcommerce.com/");
			
			WebElement register = driver.findElement(By.xpath("//a[normalize-space()='Register']"));
			
			Actions ac = new Actions(driver);
			
			// ctrl+A
			ac.keyDown(Keys.CONTROL).click(register).keyUp(Keys.CONTROL).perform();
			
			// Switching to registration page
			List<String> id = new ArrayList<String>(driver.getWindowHandles());
			
			driver.switchTo().window(id.get(1)); // switched
			
			driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("Akash");
			
			Thread.sleep(3000);
			
			// Back to Home Page
			driver.switchTo().window(id.get(0));
			
			driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("Mondal");

			Thread.sleep(3000);
			
			driver.quit();
	}

}
