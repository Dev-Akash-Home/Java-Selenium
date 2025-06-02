package com.pack;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		// Alert button
		/*driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Alert\"]")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		myalert.accept();*/
		
		//confirm button
		/*driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Confirm\"]")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		System.out.println(myalert.getText());
		//myalert.accept();
		myalert.dismiss();*/
		
		// promt alert
		driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Prompt\"]")).click();
		Thread.sleep(3000);
		Alert myalert=driver.switchTo().alert();
		myalert.sendKeys("Welcome");
	    myalert.accept();
	    Thread.sleep(5000);
		//myalert.dismiss();
		
        driver.quit();
	}

}
