package com.flipkart.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selenium_frames {

	public static void main(String[] args) {

		EdgeOptions edge = new EdgeOptions();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(edge);
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\UshaReddy\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		driver.get("https://letcode.in/frame");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("firstFr");
		WebElement Frame_text = driver.findElement(By.xpath("//h1[text()='Enter Details']"));
		String str = Frame_text.getText();
		if (str.contains("Enter Details")) {
			System.out.println("User was navigated to frames");
			driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Usha");
			driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("Testing");
		} else {
			System.out.println("User was failed to navigate");
		}
		WebElement innerframe= driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
		if(innerframe.isDisplayed())
		{
			driver.switchTo().frame(innerframe);
			WebElement ele = driver.findElement(By.xpath("//input[@name='email']"));
			if(ele.isDisplayed()) {
				ele.sendKeys("abc@gmail.com");
			}
			else 
			{
				System.out.println("Failed to enter text");
			}
//		else
//		{
//			System.out.println("Faled to enter the frame");	
		}
		}

	}


