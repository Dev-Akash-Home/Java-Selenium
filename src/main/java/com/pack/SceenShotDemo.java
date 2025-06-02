package com.pack;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SceenShotDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://www.nopcommerce.com/en/get-started");
	    
	    driver.manage().window().maximize();
	    
	    // Screenshot to take
	    TakesScreenshot ts = (TakesScreenshot) driver;
	    
	    File sourceFile =  ts.getScreenshotAs(OutputType.FILE);
	    
	    File targateFile = new File(System.getProperty("user.dir")+"\\ScreenShots\\FullPage.png"); // dynamic location
	    
	    // copy source to target file
	    sourceFile.renameTo(targateFile);    
	    
	    // Capture the specific section ss
	   WebElement specific = driver.findElement(By.xpath("//div[@class='sub-title']"));
	   
	   File sourceFile1 = specific.getScreenshotAs(OutputType.FILE);
	   
	   File targateFile1 = new File(System.getProperty("user.dir")+"\\ScreenShots\\Specific.png"); // dynamic location
	    
	    // copy source to target file
	    sourceFile1.renameTo(targateFile1);
	    
	    Thread.sleep(3000);
	    
	    driver.quit();
	}

}
