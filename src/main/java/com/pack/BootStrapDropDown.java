package com.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click(); // select drop down
		
		//driver.findElement(By.xpath("//input[@value=\"Java\"]")).click(); // select element
		
		// select all the elements
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class, 'multiselect')]//label"));
        System.out.println("Total no of Options : "+ options.size());
		
		// Enhanced loop
		for(WebElement op:options) {
			
			System.out.println(op.getText());
			String option = op.getText();
			
			if (option.equals("MySQL") || option.equals("Oracle") || option.equals("MS SQL Server")) {
				op.click();
			}
		}

		Thread.sleep(5000);

        driver.quit();
	}

}
