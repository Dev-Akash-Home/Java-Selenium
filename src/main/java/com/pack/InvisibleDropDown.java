package com.pack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InvisibleDropDown {

	public static void main(String[] args) throws Throwable {
		
        WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//driver.manage().window().maximize();
		
		// LogIn
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		// click on PIM
		//driver.findElement(By.xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'][normalize-space()='PIM']")).click();		
		driver.findElement(By.xpath("//span[@class=(normalize-space()='PIM')]")).click();
		
		// open the drop down
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[6]/div[1]/div[2]/div[1]/div[1]/div[2]/i[1]")).click();
		Thread.sleep(5000);
		
		// select single option
		//driver.findElement(By.xpath("//span[normalize-space()='SDE1']")).click();
		
		// count no of options
     	List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println("The total no of Options : "+ options.size());
		
		for(WebElement op:options) {
			System.out.println(op.getText());
		}
		
		driver.quit();
	}

}
