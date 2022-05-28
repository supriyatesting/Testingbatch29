package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	
	@FindBy (xpath ="//input[@id='email']")private WebElement emailid;
	
	
	@FindBy (xpath = "//input[@id='passwd']")private WebElement password;
	
	
	@FindBy (xpath = "//button[@id='SubmitLogin']")private WebElement submit;
	
	
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void loginAction() throws InterruptedException {
		emailid.sendKeys("supriyaberad@gmail.com");
		Thread.sleep(3000);
		password.sendKeys("Tata@2025");
		Thread.sleep(3000);
		submit.click();
		
	}
	
		
		
		
		
		
		
		
	}



