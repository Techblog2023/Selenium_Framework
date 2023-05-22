package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium08.blogspot.com/2020/01/drag-drop.html");
		WebElement src= driver.findElement(By.id("draggable"));	
//		WebElement trget= driver.findElement(By.id("droppable"));	
		
		Actions actions= new Actions(driver);
		actions.dragAndDropBy(src, 100, 100);
		actions.build().perform();
		System.out.println("Drag and Drop action has been performed successfully");
		
		

}
	
}
