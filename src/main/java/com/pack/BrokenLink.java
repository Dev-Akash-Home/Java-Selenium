package com.pack;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.deadlinkcity.com/");

		// catch all the link
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of Links : "+ links.size());
		
		int noOfBrokenLinks = 0;
		// checking condition that href has value or not
		for(WebElement linkElement:links) {
			@SuppressWarnings("deprecation")
			String href = linkElement.getAttribute("href");
			
			if(href==null || href.isEmpty()) {
				System.out.println("It's not possible to check. It's empty");
				continue;
			}
	try {
			// Pass the href value as URL format
			@SuppressWarnings("deprecation")
			URL linkURL = new URL(href);
			
			HttpURLConnection conLink = (HttpURLConnection) linkURL.openConnection(); // open connection to the server
			
			conLink.connect(); //connect and send reqst to the server
			
			if(conLink.getResponseCode()>=400) {
				System.out.println(href+ " : Broken Link");
				noOfBrokenLinks++;
			}
			else {
				System.out.println(href+ " : Proper link");
			}
		}
		catch(Exception e) {
			
		}
	}
		System.out.println("No of Broken Link : "+noOfBrokenLinks);
		
		Thread.sleep(3000);
		
		driver.quit();
	}
}
