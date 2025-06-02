package com.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement drdcon = driver.findElement(By.xpath("//select[@id=\"country\"]"));
		Select ddc = new Select(drdcon);  // Special class to capture the drop down
		
		// Select option from drop down
		//ddc.selectByVisibleText("France"); // for inner text
		//ddc.selectByValue("japan"); // Value attribute should be available to us it
		ddc.selectByIndex(3);
		
		// Captures all the elements from drop down
		List<WebElement> options = ddc.getOptions(); // return all the web elements from dropdown
		System.out.println("Total no of Options : "+ options.size());
		
		/*// loop for all the options
		for(int i=0;i<options.size(); i++) {
			System.out.println(options.get(i).getText());
		}*/
		
		// Enhanced loop
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
		Thread.sleep(5000);
		
        driver.quit();
	}

}
