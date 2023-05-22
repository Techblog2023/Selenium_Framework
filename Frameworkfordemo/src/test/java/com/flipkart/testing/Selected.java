package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Selected {

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
		driver.get("https://artoftesting.com/samplesiteforselenium");
		
		WebElement radio_button = driver.findElement(By.xpath("//input[@id='male']"));
		
		radio_button.click();
		if(radio_button.isDisplayed())
		{
			if(radio_button.isSelected())
			{
				System.out.println("True");
			}
			else
			{
			System.out.println("False");
			}
		}
		else
		{
			System.out.println("Not Displayed on the Screen");
		}
			
		
		driver.quit();
			
	}

}
