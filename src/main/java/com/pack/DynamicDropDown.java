package com.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDown {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("lone rider");
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@role='listbox']//li//div[@role='option']"));
		System.out.println("The total no of Options : "+ options.size());
		
		for(int i=0;i<options.size();i++) {
			System.out.println(options.get(i).getText());
			
			if(options.get(i).getText().equals("lone rider")) {
				options.get(i).click();
				break;
			}
		}
		
		driver.quit();
	}

}
