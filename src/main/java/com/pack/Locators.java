package com.pack;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Locators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in/");
/*		driver.manage().window().maximize();        // windows maximize/minimize
		
		// Id Attribute
		boolean logodisplayed = driver.findElement(By.id("nav-logo-sprites")).isDisplayed();  // Id status
		System.out.println(logodisplayed);
				
		// Name Attribute
		//driver.findElement(By.name("field-keywords")).sendKeys("Mac");   // find elements
		
		// link text & partial link text
		//driver.findElement(By.linkText("Fresh")).click();
		driver.findElement(By.partialLinkText("Fre")).click();   // partial  
		
		// Class Attribute
		List<WebElement> headerlinks = driver.findElements(By.className("nav-a"));
		System.out.println("total no of header links : "+ headerlinks.size());    */
		
		//Tag Name
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("total no of links : "+ links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("total no of images : "+ images.size());
		
        driver.quit();
	}

}
