package com.pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethod {   // work on web elements

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		 //driver.get("https://flipkart.com/");
		//driver.get("https://www.amazon.in/ap/register?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26tag%3Dgooghydrabk1-21%26ref%3Dnav_custrec_signin%26adgrpid%3D155259813593%26hvpone%3D%26hvptwo%3D%26hvadid%3D674893540034%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D9035776624976948677%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9301660%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2316413%26gad_source%3D1&prevRID=CZ28MRRP6WNNEWD7QHPR&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&pageId=inflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		 driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F"); 
		Thread.sleep(2000);
         
		 // isDisplayed()
		 //WebElement logo = driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-logo\"]"));
		 //System.out.println("Display status of Logo : "+ logo.isDisplayed());
		 
	                                   //   Alternate //	 
		 
		 //boolean status1 = driver.findElement(By.xpath("//i[@class=\"a-icon a-icon-logo\"]")).isDisplayed();
		 //System.out.println("Display status of Logo : "+ status1);
		 
		// isEnebled()
		//WebElement status = driver.findElement(By.xpath("//input[@id=\"ap_customer_name\"]"));
		//System.out.println("Enable status : "+ status.isEnabled());
		 
		// isSelected()
		WebElement male_rd = driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
		WebElement female_rd = driver.findElement(By.xpath("//input[@id=\"gender-female\"]"));
		
		 /**************    before selection    ***********/
		System.out.println("*********before selection**********");
		System.out.println("Selected button for male : "+ male_rd.isSelected());
		System.out.println("Selected button for female : "+ female_rd.isSelected());
		
		 /**************    After selection    ***********/
		System.out.println("************After selection***************");
		female_rd.click();
		System.out.println("Selected button for male : "+ male_rd.isSelected());
		System.out.println("Selected button for female : "+ female_rd.isSelected());
		
		 driver.quit();  // close multiple browser window
		 driver.close(); // close single browser window
	}

}
