package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Selenium {
	
	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement dbclick= driver.findElement(By.id("dblClkBtn"));		
		Actions actions= new Actions(driver);
		actions.moveToElement(dbclick).doubleClick().perform();
		driver.switchTo().alert().accept();
		
		
		
		//actions.moveToElement().click().perform();
		//actions.moverToElement().click("Webelement").perform();
		
		//actions.moveToElement(element).doubleClick().perform();
		//actions.moveToElement(element).contextClick().perfrom();
		//clickAndHold();
		// actions.clickAndHold().MoveByOffset(100,200).perfrom()
		//actions.clickAndHold().MoveByOffset(100,200).release().perfrom()
		//actions.dragAndDrop(, null).perfeom();
		
		
	}

}
