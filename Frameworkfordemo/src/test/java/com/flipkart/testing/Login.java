package com.flipkart.testing;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Testing.Frameworkfordemo.DriverSetup;
import Testing.Frameworkfordemo.Loginpage;

public class Login {

	
	
	// Create WebDriver reference. 
	   public WebDriver driver; 
	   @Test 
	   public void homePage() 
	   { 
	// Create an object of FirefoxDriver class to open Firefox browser. 
	     driver = new ChromeDriver(); 
	     System.out.println("Launching Firefox browser"); 

	// Declare URL of google home page with data type string. 
	     String URL = "https://www.google.com"; // Creating string literal. 

	// Call get() method and pass URL as a parameter. This method is used to open the URL of web applications in the browser. It will wait until the whole page gets loaded. 
	     driver.get(URL); 

	// Call getTitle() method to get the title of home page. Since this method will return the title of homepage as a string. That's why we will store it using a variable getTitle of type String. 
	     String getTitle = driver.getTitle(); 
	     System.out.println("Title of home page: " +getTitle); 

	// Call close() method to close browser. 
	     driver.close();
	  } 
	}
