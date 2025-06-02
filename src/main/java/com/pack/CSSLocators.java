package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://amazon.in/");
		//driver.manage().window().maximize(); 

		// Tag Id
		//driver.findElement(By.cssSelector("input#twotabsearchtextbox")).sendKeys("Box");
		
		// Tag Class
		//driver.findElement(By.cssSelector("input.nav-input")).sendKeys("Shirts");
		//driver.findElement(By.cssSelector(".nav-input")).sendKeys("Shirts");
		
		// Tag Attribute
		//driver.findElement(By.cssSelector("input[placeholder='Search Amazon.in']")).sendKeys("pen");
		//driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("pen");
		//driver.findElement(By.cssSelector("[placeholder=\"Search Amazon.in\"]")).sendKeys("pen");
		
		// Tag Class Attribute
		driver.findElement(By.cssSelector("input.nav-input[name='field-keywords']")).sendKeys("pencil");
		
		
		driver.quit();
	}

}
