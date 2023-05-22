package com.flipkart.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Demo_keyboard {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));		
		WebElement google_search = driver.findElement(By.name("q"));
		/* Performning mousehover actions */

		Actions action = new Actions(driver);
		
		Action test_key = action.keyDown(google_search,Keys.SHIFT)		
		.sendKeys("Amazon")
		.keyUp(Keys.SHIFT).build();
		test_key.perform();
		

	}

}
