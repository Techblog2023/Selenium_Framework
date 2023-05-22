package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click_and_Hold {
	
public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		WebElement textC = driver.findElement(By.xpath("//li[text()='C']"));
		Actions actions = new Actions(driver);
		
		actions.moveToElement(textC).clickAndHold().perform();
		driver.quit();
	
}

}
