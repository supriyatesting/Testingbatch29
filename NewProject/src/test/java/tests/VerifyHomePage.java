package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.HomePage;
import Test.HomePageBase;
import Test.Loginpage;

public class VerifyHomePage {
	WebDriver driver ;
	HomePageBase base;
	Loginpage login;
	HomePage home;
	
	@BeforeClass
	public void launchBrowser() {
		
			System.setProperty("webdriver.chrome.driver", "E:\\Automation IMP\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	@BeforeMethod
	public void loanchApp() throws InterruptedException {
		driver.get("http://automationpractice.com/index.php");
		base = new HomePageBase(driver);
		base.clickonsign();
		login = new Loginpage(driver);
		login.loginAction();
	}
		
		@Test (priority=1)
		public void verifyLoginin() {
			String url = driver.getCurrentUrl();
			Assert.assertEquals(url, "http://automationpractice.com/index.php?controller=authentication&back=my-account");
		}
		@Test (priority=2)
		public void varifywomenclick() {
			home=new HomePage (driver);
			 
			home.clickwoman();
			String url2 =driver.getCurrentUrl();
			Assert.assertEquals(driver.getCurrentUrl(), url2);
			}
		
//		@AfterMethod
//		public void logout() {
//			home=new HomePage (diver);
//			home.logout();
//		}
		
		@AfterClass
		public void close() {
			driver.quit();
			}
		}
			
			
			
			
			
	
		


		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
		
		
	
	
	

