package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocators {
	
	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UshaReddy\\Documents\\Chrome\\New_Version\\chromedriver_win32 (5)\\chromedriver.exe");
		driver.get("https://www.facebook.com/");		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8522985084");
		
		//String= verify the text or compare the two string
		//Webelemnt= getText() from an element
		WebElement fb_text= driver.findElement(By.xpath("//h2[contains(@class,'_8e')]"));
		
		System.out.println(fb_text.getText());
		
		driver.quit();
	}

}
