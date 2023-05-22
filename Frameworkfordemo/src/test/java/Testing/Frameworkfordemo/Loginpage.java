package Testing.Frameworkfordemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	WebDriver driver;
	
	// page URL
	private static String Page_URL="https://www.rediff.com/";
	

	@FindBy(xpath="//a[@title='Create Rediffmail Account']")
    private WebElement loginid;
	
	@FindBy(css="input[maxlength='61']")
	private WebElement username;
	
	
	public Loginpage(WebDriver driver)
	{
		this.driver= driver;
		driver.get(Page_URL);
		PageFactory.initElements(driver, this);
	}



	
	public void loginimplement(String uname)
	{
		username.sendKeys(uname);
		
	}
	
	public void clickingbtn()
	{
		loginid.click();
	}
	

	
}

