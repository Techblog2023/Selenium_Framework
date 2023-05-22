package com.flipkart.testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class RCActionsWebElement {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://selenium08.blogspot.com/2019/12/right-click.html");
		WebElement contextmenu = driver.findElement(By.xpath("//div[@id='div-context']"));
		Actions actions = new Actions(driver);
		actions.contextClick(contextmenu);
		WebElement jscript = driver.findElement(By.xpath("//a[text()='Javascript']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		actions.click(jscript).perform();
	
		driver.switchTo().alert().accept();
		driver.quit();

	}

}
