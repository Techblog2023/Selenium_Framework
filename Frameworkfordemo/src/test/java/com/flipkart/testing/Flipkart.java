package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	
	/*
	1. Open the flipkart URL
	2. Click on login
	3. Enter credentials
	4.click on submit 
 * 
 */
	
	public static void main(String[] args) throws InterruptedException {
		Locators obj = new Locators();
		
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
		driver.manage().window().maximize();
		String title =driver.getTitle();
		System.out.println(title);
		String str =driver.getCurrentUrl();
		System.out.println(str);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		obj.flipcart_locators("Mobiles");
		
//		driver.findElement(By.className("_1_3w1N")).click();
//		Thread.sleep(1000);
		driver.quit();

		
	}
	
	
	
	
	
	
	
}
