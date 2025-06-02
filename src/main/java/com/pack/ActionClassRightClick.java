package com.pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassRightClick {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();
        
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement btn = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions ac = new Actions(driver);
		
		// Right Click
		ac.contextClick(btn).perform();
		
		driver.findElement(By.xpath("//li[@class='context-menu-item context-menu-icon context-menu-icon-copy']")).click();
		
		Alert myalert = driver.switchTo().alert();
		System.out.println(myalert.getText());
		Thread.sleep(5000);
		myalert.accept();
		
		driver.quit();
	}

}
