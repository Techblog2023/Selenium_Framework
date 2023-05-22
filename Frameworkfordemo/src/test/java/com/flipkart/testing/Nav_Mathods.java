package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nav_Mathods {
	public static void main(String[] args) throws InterruptedException {
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

		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
		driver.navigate().to("https://seller.flipkart.com/sell-online/?utm_source=fkwebsite&utm_medium=websitedirect");
		String newurl = driver.getCurrentUrl();
		System.out.println(newurl);
		if (currenturl != newurl) {
			System.out.println("We are in a new page");
			Thread.sleep(1000);
			driver.navigate().back();
			
		} else {
			System.out.println("We are in the same page");
		}

		
		WebElement ele = driver.findElement(By.xpath("//span[text()='Become a Seller']"));

		Boolean b =ele.isDisplayed();
		System.out.println(b);
		
		if(b==true)
		{
			String ele_text = ele.getText();
			System.out.println("Text of the seller" + ele_text);		
		}
		else
		{
			System.out.println("Failed");
		}
	}

}
