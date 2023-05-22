package com.flipkart.testing;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkbox {
	

		public static void main(String[] args) throws InterruptedException {
			
			EdgeOptions edge = new EdgeOptions();
//			ChromeOptions chromeOptions = new ChromeOptions();
//			WebDriverManager.chromedriver().setup();
			WebDriverManager.edgedriver().setup();
			WebDriver driver = new EdgeDriver(edge);
//			System.setProperty("webdriver.chrome.driver",
//				"C:\\Users\\UshaReddy\\Documents\\Chrome\\New_Version\\chromedriver_win32 (5)\\chromedriver.exe");
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\UshaReddy\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
			driver.get("https://artoftesting.com/samplesiteforselenium");
			
			WebElement ele =driver.findElement(By.xpath("//input[@class='Automation']"));
			
			ele.click();
			Thread.sleep(1000);
			driver.quit();
			
			
			
			
		}
		

}
