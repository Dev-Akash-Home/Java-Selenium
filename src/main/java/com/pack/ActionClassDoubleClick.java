package com.pack;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDoubleClick {

	public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		
		driver.switchTo().frame("iframeResult");
		
		WebElement input1 = driver.findElement(By.xpath("//input[@id='field1']"));
		input1.clear();
		input1.sendKeys("Kill Him that");
		
		WebElement input2 = driver.findElement(By.xpath("//input[@id='field2']"));
		
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions ac = new Actions(driver);
		
		// Double Click
		ac.doubleClick(btn).perform();
		
		// getText() method only capture inner text of the elements
		//String text = input2.getText();
		
		// Instead of getText we use getAttribute
		@SuppressWarnings("deprecation")
		String text = input2.getAttribute("value");
		
		if(text.equals("Kill Him")) {
			System.out.println("Text matched : "+text);
		}
		else {
			System.out.println("Text not matched : "+text);
		}
		
		
		driver.quit();
	}

}
