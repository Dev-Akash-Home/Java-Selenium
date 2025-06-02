package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		
        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement madrid = driver.findElement(By.xpath("//div[@id='box7']"));
		
		WebElement spain = driver.findElement(By.xpath("//div[@id='box107']"));
		
		Actions ac = new Actions(driver);
		
		// Drag and Drop Click
		ac.dragAndDrop(madrid, spain).perform();
		
		Thread.sleep(3000);
		
        driver.quit();
	}

}
