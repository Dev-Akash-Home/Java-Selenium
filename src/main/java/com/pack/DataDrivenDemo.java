package com.pack;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DataDrivenDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		 
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	        
	    driver.get("https://www.moneycontrol.com/fixed-income/calculator/state-bank-of-india-sbi/fixed-deposit-calculator-SBI-BSB001.html");
	    
	   // driver.manage().window().maximize();
	    
	    String filepath = System.getProperty("user.dir")+"\\TestData\\Interest.xlsx";
	    
	    int rows = UtilityPage.getRowCount(filepath, "sheet1");
	   
	    for (int i=1;i<=rows;i++) {
		   
		   // Read data from Excel
		   String principle = UtilityPage.getCellData(filepath, "sheet1", i, 0);
		   String rateOfInterest = UtilityPage.getCellData(filepath, "sheet1", i, 1);
		   String period1 = UtilityPage.getCellData(filepath, "sheet1", i, 2);
		   String period2 = UtilityPage.getCellData(filepath, "sheet1", i, 3);
		   String frequency = UtilityPage.getCellData(filepath, "sheet1", i, 4);
		   String maturity = UtilityPage.getCellData(filepath, "sheet1", i, 5);
		   
		   // Pass the above data in the application
		   driver.findElement(By.xpath("//input[@id='principal']")).sendKeys(principle);
		   
		   driver.findElement(By.xpath("//input[@id='interest']")).sendKeys(rateOfInterest);
		   
		   driver.findElement(By.xpath("//input[@id='tenure']")).sendKeys(period1);
		   
		   Select tp = new Select(driver.findElement(By.xpath("//select[@id='tenurePeriod']")));
		   tp.selectByVisibleText(period2);
		   
		   Select fr = new Select(driver.findElement(By.xpath("//select[@id='frequency']")));
		   fr.selectByVisibleText(frequency);
		   
		   // Click the element
		   driver.findElement(By.xpath("//div[@class='cal_div']//a[1]")).click();
		   
		   // Validation
		   String act_mvalue = driver.findElement(By.xpath("//span[@id='resp_matval']//strong")).getText();
		   
		   if(Double.parseDouble(maturity)==Double.parseDouble(act_mvalue)) {
			   System.out.println("Test Passed....");
			   UtilityPage.setCellData(filepath, "sheet1", i, 7, "Passed");
			   UtilityPage.fillGreenColour(filepath, "sheet1", i, 7);  
		   }
		   else {
			   System.out.println("Test failed....");
			   UtilityPage.setCellData(filepath, "sheet1", i, 7, "Failed");
			   UtilityPage.fillRedColour(filepath, "sheet1", i, 7); 
		   }
		   
		   Thread.sleep(2000);
		   driver.findElement(By.xpath("//div[@class='cal_div']//a[2]")).click();
	   }
	   
	   driver.quit();
	}

}
