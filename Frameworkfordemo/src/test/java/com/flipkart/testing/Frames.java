package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	

public static void main(String[] args) throws InterruptedException {
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://letcode.in/frame");
			driver.manage().window().maximize();
		
		
			
			driver.switchTo().frame("firstFr");
			
			driver.findElement(By.xpath("//input[@name='fname']")).sendKeys("Testing");
			driver.findElement(By.xpath("//input[@name='lname']")).sendKeys("batch5");
			
			WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='innerFrame']"));
			if(innerframe.isDisplayed())
			{
			
			driver.switchTo().frame(innerframe);
			driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Testing123@gmail.com");
			System.out.println("Switched to frame");
			}
			else
			{
				System.out.println("Not Switched to childframe");	
			}
		
			
			driver.switchTo().parentFrame();
			WebElement text_value = driver.findElement(By.xpath("//h1[text()='Enter Details']"));
			
			System.out.println(text_value.getText());
			
			driver.quit();
					
		}
	}


