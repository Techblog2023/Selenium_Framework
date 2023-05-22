package com.flipkart.testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_cl {
	public static void main(String[] args) {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\UshaReddy\\Documents\\Chrome\\New_Version\\chromedriver_win32 (5)\\chromedriver.exe");
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		String str =driver.getTitle();
		System.out.println(str);
		driver.quit();
		
		}
	}


