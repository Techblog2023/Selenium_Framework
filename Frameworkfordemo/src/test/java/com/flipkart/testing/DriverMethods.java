package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverMethods {
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
		System.out.println("Current URL" + driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getTitle());
		WebElement ele = driver.findElement(By.xpath("//span[text()='Become a Seller']"));

		WebElement inp_val = driver.findElement(By.xpath("//input[@class='_3704LK']"));
		System.out.println(inp_val.getAttribute("class"));
		
		String str = ele.getText();
		if (str.contains("ABC")) {
			System.out.println("Text of the element" + ele.getText());
		} else {
			System.out.println("Invalid text");
		}

		System.out.println("Tagname of the Element" + ele.getTagName());

//		driver.close();// close only the browser window that webdriver is currently controling
		driver.quit();// close all windows opened by webdriver
	}

}
