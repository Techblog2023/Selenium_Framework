package com.flipkart.testing;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Aletrs_Session {
	public static void main(String[] args) {
		
		EdgeOptions edge = new EdgeOptions();
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver(edge);
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\UshaReddy\\Downloads\\edgedriver_win64 (4)\\msedgedriver.exe");
		driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		driver.findElement(By.xpath("//input[@id='simple']")).click();
		String alert_text = driver.switchTo().alert().getText();
		System.out.println(alert_text);
		driver.switchTo().alert().accept();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement ele =driver.findElement(By.xpath("//button[@id='prompt']"));
		ele.click();
		Alert al =driver.switchTo().alert();
		al.sendKeys("Testing");
		al.accept();
		WebElement displaymsg = driver.findElement(By.id("prompt_demo"));
		String getText= displaymsg.getText();
		if(getText.equalsIgnoreCase("Hello Testing! How are you today?"))
		{
			System.out.println("Text Matched");
			
		}
		else
		{
			System.out.println("Something went wrong");
			
		}
		//**********************************Confirmation Alert********************
		WebElement confirmation_alert =driver.findElement(By.xpath("//button[@id='confirm']"));
		confirmation_alert.click();
		String conf_Msg= al.getText();
		System.out.println(conf_Msg);
//		al.accept();
		al.dismiss();
		
		
		driver.quit();
		
		
		

	}
	

}
