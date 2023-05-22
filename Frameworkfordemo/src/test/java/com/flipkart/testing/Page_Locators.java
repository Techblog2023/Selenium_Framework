package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Page_Locators {


	
	WebDriver driver = new ChromeDriver();

	public WebElement Login = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));

}
