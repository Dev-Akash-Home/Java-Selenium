package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassMouseHover {

	public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        
		driver.get("https://www.snapdeal.com/");
		
		WebElement fashion = driver.findElement(By.xpath("//span[text()=\"Men's Fashion\"]"));
		
		WebElement shoes = driver.findElement(By.xpath("//a[contains(@href,'https://www.snapdeal.com/products/mens-footwear-sports-shoes')]//span[contains(@class,'linkTest')][normalize-space()='Sports Shoes']"));
		
		Actions ac = new Actions(driver); // PreRequsite : need pass driver as a parameter
		
		// Mouse hover action and mandatory use : build().perform()
		//ac.moveToElement(fashion).moveToElement(shoes).click().build().perform();
		
		// build : create action VS perform : both create and perform action
		ac.moveToElement(fashion).perform();
		
		Thread.sleep(5000);
		
		ac.moveToElement(shoes).click().perform();
		
		Thread.sleep(5000);
		
		driver.quit();
	}

}
