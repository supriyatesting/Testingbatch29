package CrossBrowserResting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.opera.OperaDriver;

public class CrossBrowserDemo {
	
	
	
	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation IMP\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	return driver;
	}

	public static WebDriver openFirefoxDriver() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation IMP\\chromedriver.exe");
		WebDriver driver= new FirefoxDriver();
	return driver ();
	
	public static WebDriver openOperaBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation IMP\\chromedriver.exe");
		WebDriver driver= new OperaDriver();
	return driver;
	
	public static WebDriver openedgeBrowser() {
		System.setProperty("webdriver.chrome.driver", "E:\\Automation IMP\\chromedriver.exe");
		WebDriver driver= new edgeDriver();
	return driver;
	}
	}
	




