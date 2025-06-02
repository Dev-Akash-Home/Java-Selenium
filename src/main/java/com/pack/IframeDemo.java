package com.pack;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		// Frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		
		driver.switchTo().frame(frame1);
		
		driver.findElement(By.xpath("//input[@name=\"mytext1\"]")).sendKeys("Hello");
		
		driver.switchTo().defaultContent(); // Back to Main Page
		
		// Frame 2
        WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("World");
		
		driver.switchTo().defaultContent(); // Back to Main Page
		
		// Frame 3
        WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		
		driver.switchTo().frame(frame3);
		
		driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Welcome");
		
		// iframe - inside frame 3
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//div[@id=\"i24\"]//div[@class=\"uHMk6b fsHoPb\"]")).click();
		
		driver.switchTo().defaultContent();
		
		// Frame 5
		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		
		driver.switchTo().frame(frame5);
		
		driver.findElement(By.xpath("//a[normalize-space()=\"https://a9t9.com\"]")).click();
		
      /*  Set<String> windowIDs = driver.getWindowHandles();
	    
	    for(String winid:windowIDs) {
	    	String title = driver.switchTo().window(winid).getTitle();
	    	System.out.println(title);
	    	
	    	   if(title.equals("Ui.Vision by a9t9 software - Image-Driven Automation")) {
	    		driver.close();
	       }
	    } */
		
		Thread.sleep(5000);
			
		driver.quit();
	}

}
