package com.pack;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsWithExplicitWait {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()=\"Click for JS Prompt\"]")).click();
		
		Alert myalert = mywait.until(ExpectedConditions.alertIsPresent());
		
		System.out.println(myalert.getText());
		myalert.sendKeys("Welcome");
	    myalert.accept();
	    Thread.sleep(5000);

	    driver.quit();
	}

}
