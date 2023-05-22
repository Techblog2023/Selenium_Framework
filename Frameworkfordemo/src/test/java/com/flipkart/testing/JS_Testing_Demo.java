package com.flipkart.testing;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JS_Testing_Demo {
	public static void main(String[] args) throws InterruptedException {
		
	
	
	WebDriver driver = new EdgeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login.php/");
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	WebElement email = (WebElement) js.executeScript("return document.getElementById('email').setAttribute('style','border:5px blue solid;background:pink');");
	Thread.sleep(1000);
	email.sendKeys("ID value");
	
	WebElement password =(WebElement) js.executeScript("return document.getElementById('pass');");
	password.sendKeys("PasswordID");
	
	js.executeScript("document.getElementsByName('login')[0].click()");
	
	
	
	
	
	
	
	
	
	}
	

}
