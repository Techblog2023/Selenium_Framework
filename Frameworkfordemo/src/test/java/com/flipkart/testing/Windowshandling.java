package com.flipkart.testing;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Windowshandling {
	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.id("tabButton")).click();
		String parent_window = driver.getWindowHandle();// single window
		Set<String> allwindows = driver.getWindowHandles();
		// Iterator<String> itr = allwindows.iterator();

//		while (itr.hasNext()) {
		for (String str : allwindows) {
			if (!str.contentEquals(parent_window)) {
				driver.switchTo().window(str);
				WebElement new_tab = driver.findElement(By.id("sampleHeading"));
				System.out.println("Element text was:" + new_tab.getText());
			}

		}
		driver.quit();

	}
}
