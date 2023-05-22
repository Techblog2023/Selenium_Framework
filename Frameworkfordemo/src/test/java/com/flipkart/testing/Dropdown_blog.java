package com.flipkart.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown_blog {
	public static void main(String[] args) {
		
		EdgeOptions edge = new EdgeOptions();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(edge);
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\UshaReddy\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		
		WebElement parentdropdown= driver.findElement(By.xpath("//select[@name='country']"));
		Select select = new Select(parentdropdown);
		select.selectByValue("IN");
		
		
		// Locator fro month dropdown
		WebElement month = driver.findElement(By.xpath("//select[@name='Month']"));
		
		//created an object using select class
		Select monthdropdown = new Select(month);
		
		if(monthdropdown.isMultiple())
		{
			System.out.println("Dropsown allows multiple-choice list");
		}
		else
		{
			System.out.println("Dropsown does not allows multiple-choice list");
		}
		
		monthdropdown.selectByVisibleText("May");
		monthdropdown.selectByVisibleText("January");
		monthdropdown.selectByVisibleText("March");
		monthdropdown.selectByVisibleText("September");
		
		// verify that the number of choicrs in the list selected
		
		if(monthdropdown.getAllSelectedOptions().size()==4)
		{
			System.out.println("$ options have been chosen");
		}
		else
		{
			System.out.println("Invalid selection");
		}
		
		monthdropdown.deselectByValue("Sept");
		
		
		
		
	}

}
