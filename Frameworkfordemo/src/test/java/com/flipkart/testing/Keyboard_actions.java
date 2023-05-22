package com.flipkart.testing;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions {
	public static void main(String[] args) {
		
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoqa.com/text-box");
	WebElement fullname= driver.findElement(By.id("userName"));		
	fullname.sendKeys("Usha");
	
	WebElement address = driver.findElement(By.id("currentAddress"));
	
	address.sendKeys("testing address");
	
	address.sendKeys(Keys.CONTROL);
	address.sendKeys("A");
	address.sendKeys(Keys.CONTROL);
	address.sendKeys("C");
	address.sendKeys(Keys.TAB);
	
	WebElement permenent_address= driver.findElement(By.id("permanentAddress"));
	permenent_address.sendKeys(Keys.CONTROL);
	permenent_address.sendKeys("V");
	
	assertEquals(address.getAttribute("value"),permenent_address.getAttribute("value"));
	

	
	
	
	
	
	}

}
