package com.flipkart.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAtCurrentLocation {
	
	public static void main(String[] args) {
		WebDriver driver= new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement gmail= driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions actions = new Actions(driver);
		int getx= gmail.getLocation().getX();
		System.out.println("X coordinate:" +getx);
		int gety= gmail.getLocation().getY();
		System.out.println("Y coordinate:" +gety);
		actions.moveByOffset(getx, gety).click();
		actions.build().perform();
		
		System.out.println("Clicked successfully on gmail");
		
		driver.quit();
		
		
	}

}
