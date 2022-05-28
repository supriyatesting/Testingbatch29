package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageBase {
	@FindBy (xpath="//a[@class='login']")private WebElement signin;
	private WebDriver driver;
	
	public HomePageBase (WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	public void clickonsign() {
		signin.click();
		}

}
