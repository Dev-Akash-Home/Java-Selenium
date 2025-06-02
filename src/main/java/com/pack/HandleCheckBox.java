package com.pack;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBox {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// specific check box
		//driver.findElement(By.xpath("//input[@id=\"sunday\"]")).click();
		
		// multiple check boxes
		List<WebElement> chkboxes = driver.findElements(By.xpath("//input[@class=\"form-check-input\" and @type=\"checkbox\"]"));

		/*for(WebElement chkbox:chkboxes) {
			chkbox.click();
		}*/
		
		// last 3 check boxes
		/*for(int i=4;i<chkboxes.size();i++) {
			chkboxes.get(i).click();
		}*/
		
		// first 3 check boxes
		/*for(int i=0;i<3;i++) {
			chkboxes.get(i).click();
		}*/
		
		// unselect selected check boxes		
		for(int i=0;i<3;i++) {
			chkboxes.get(i).click();
		}
		
		Thread.sleep(3000);
		for(int i=0;i<chkboxes.size();i++) {
			if(chkboxes.get(i).isSelected()) {
				chkboxes.get(i).click();	
			}
		}
		
		driver.quit();
	}

}
