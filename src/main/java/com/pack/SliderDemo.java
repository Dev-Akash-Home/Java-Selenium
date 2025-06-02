package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderDemo {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		
		// Minimum Slider
		WebElement minSlide = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default'][1]"));
		
		System.out.println("Location of the minimum slider before moving : "+minSlide.getLocation()); // (x, y)=(59, 275)
		
		// Maximum Slider
		WebElement maxSlide = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		
		System.out.println("Location of the maximum slider before moving : "+maxSlide.getLocation()); // (x, y)=(412, 275)
		
		Actions ac = new Actions(driver);
		
		ac.dragAndDropBy(minSlide,100, 0).perform();  // moving the min slider
		
		ac.dragAndDropBy(maxSlide, -200, 275).perform();  // moving the max slider
		
		System.out.println("Location of the minimum slider after moving : "+minSlide.getLocation()); // (x, y)=(159, 275)
		
		System.out.println("Location of the maximum slider after moving : "+maxSlide.getLocation()); // (x, y)=(211, 250)
		
		Thread.sleep(3000);
		
        driver.quit();
	}

}
