package com.flipkart.testing;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enabled {
	
	public static void main(String[] args) {
		
		EdgeOptions edge = new EdgeOptions();
//		ChromeOptions chromeOptions = new ChromeOptions();
//		WebDriverManager.chromedriver().setup();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(edge);
//		System.setProperty("webdriver.chrome.driver",
//			"C:\\Users\\UshaReddy\\Documents\\Chrome\\New_Version\\chromedriver_win32 (5)\\chromedriver.exe");
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\UshaReddy\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		driver.get("https://www.flipkart.com/");
		
		WebElement searchbox =driver.findElement(By.xpath("//input[contains(@title,'Search')]"));
		//Old Syntax
//		WebDriverWait wait = new WebDriverWait(driver,20);
		
		//************************NEW Explicit SYNTAX****************************************
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOf(searchbox));
		
		//**********************************Fluent Wait***********************************************
		//Declaring the fluentwait
		FluentWait fwait = new FluentWait(driver);
		//Specifying the timeout of the wait
		fwait.withTimeout(Duration.ofSeconds(250));
		// Specify poliing time
		fwait.pollingEvery(Duration.ofSeconds(100));
		//Specify what exceptions to ignore
		
		fwait.ignoring(NoSuchElementException.class);
		fwait.until(ExpectedConditions.visibilityOf(searchbox));
		
		//********************************PageLoadTimeOut***************************
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(250));

		
		
		if(searchbox.isEnabled())
		{
			System.out.println("Serachbox is enabled" + searchbox.isEnabled());
			searchbox.sendKeys("Teddy bear");
		}
		else
		{
			System.out.println("Serach box is disabled" + searchbox.isEnabled());
		}
		
		driver.quit();
	}

}
