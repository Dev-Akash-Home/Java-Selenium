package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://flipkart.com/");
		//driver.get("https://amazon.in/");
		//driver.manage().window().maximize();
		
		// single attribute
		//driver.findElement(By.xpath("//*[@placeholder='Search Amazon.in']")).sendKeys("Panty");
	    
		// multiple attribute
		//driver.findElement(By.xpath("//input[@name='field-keywords'][@placeholder='Search Amazon.in']")).sendKeys("Panty");
     
		// And operator : both should be true
		//driver.findElement(By.xpath("//input[@name='field-keywords' and @placeholder='Search Amazon.in']")).sendKeys("Panty");
		
		// And operator : either one should be true
		//driver.findElement(By.xpath("//input[@name='field-keywords' or @placeholder='Search']")).sendKeys("Panty");

		// inner text
		//driver.findElement(By.xpath("//*[text()='Bestsellers in Shoes & Handbags']"));
		// Using contains
		//[contains(text()='Bestsellers in Shoes & Handbags'0] //instead of text we can use dot(.) also
		
		// text
		//boolean displaystatus = driver.findElement(By.xpath("//a[text()='Fresh']")).isDisplayed();
		//System.out.println(displaystatus);
		
		//String value = driver.findElement(By.xpath("//a[text()='Fresh']")).getText();
		//System.out.println(value);
		
		// contain 
		//driver.findElement(By.xpath("//*[contains(@placeholder, 'Sear')]")).sendKeys("bra");  // verify partial element  // can be any where of the string		
		// starts-with
		//driver.findElement(By.xpath("//*[starts-with(@placeholder, 'Sear')]")).sendKeys("bra"); // only works with start of the string
		
		
		// **************** both contains and stars-with used for dynamic element ****************//
		// //*[@id='start' or @id='stop']
		// //*[contains(@id, 'St')
		// //*[starts-with(@id, 'St')
		
		// chained Xpath = relative + absolute xpath
		// //div[@id='logo']/a/img   // when targeted element has no attribute
		// Relative Xpath = //div[@id='logo'] & Absolute Xapth = /a/img
		boolean status = driver.findElement(By.xpath("//div[@class='zlQd20 _1eDlvI']/picture/img")).isDisplayed();
		System.out.println(status);
		
		driver.quit();
	}

}
