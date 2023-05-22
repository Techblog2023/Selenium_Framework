package Testing.Frameworkfordemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DriverSetup {
	
	WebDriver driver;
	@Test
	public void setup(String browser) {
       	if(browser.equalsIgnoreCase("Chrome"))
       	{	
       		System.out.println("The browser value is : " +browser); 
    		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UshaReddy\\eclipse-workspace\\POMFramework\\Drivers\\chromedriver.exe");
    		driver = new ChromeDriver();
    		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

       	}
       	else if(browser.equalsIgnoreCase("EDGE"))
       	{
               	System.out.println("The browser value is : " +browser);
        		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UshaReddy\\eclipse-workspace\\POMFramework\\Drivers\\msedgedriver.exe");
        		driver = new EdgeDriver();
        		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        	
                	
       	}
       	else
       	{
               	System.out.println("Incorrect browser value passed.");
       	}
       	
       	
	}

		
	}



