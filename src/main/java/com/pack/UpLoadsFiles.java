package com.pack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpLoadsFiles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
	    
	    Thread.sleep(3000);
	    
/*	    // Single file upload
	   WebElement fd = driver.findElement(By.xpath("//input[@id='filesToUpload']"));
	   fd.sendKeys("C:\\Users\\akash\\OneDrive\\ドキュメント\\Custom Office Templates\\Text2.txt");
	    
	   if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("Text2.txt")) {
		   System.out.println("File uploaded successfully");
	   }
	   else {
		   System.out.println("File not loaded");
	   } 
	    */
        String f1 = "C:\\Users\\akash\\OneDrive\\ドキュメント\\Custom Office Templates\\Text1.txt";
	    
	    String f2 = "C:\\Users\\akash\\OneDrive\\ドキュメント\\Custom Office Templates\\Text2.txt";
	    
	    String f3 = "C:\\Users\\akash\\OneDrive\\ドキュメント\\Custom Office Templates\\Text3.txt";
	    
	    String f4 = "C:\\Users\\akash\\OneDrive\\ドキュメント\\Custom Office Templates\\Text4.txt";
	    
	    WebElement fd1 = driver.findElement(By.xpath("//input[@id='filesToUpload']"));
		fd1.sendKeys(f1+" "+f2+" "+f3+" "+f4);
		
		// no of files upload
		int noOfCount = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();
		
		if(noOfCount==4) {
			System.out.println("All files uploaded");
		}
		else {
			System.out.println("Files upload failed");
		}
	   
		// files name
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text1.txt")
		    && (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text2.txt"))
		    && (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text3.txt"))
		    && (driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("Text4.txt")))
		{
			System.out.println("File name are matching successfully");
		}
		else {
			System.out.println("File names are not matching");
		}
		
	   Thread.sleep(3000);

	   driver.quit();
	}

}
