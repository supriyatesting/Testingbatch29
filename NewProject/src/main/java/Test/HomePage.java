package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//img[@class='logo img-responsive']") private WebElement logo ;
	
	@FindBy (xpath = "	//div[@class='shopping_cart']") private WebElement addtocart ;
	
	@FindBy (xpath = "//a[@title='Women']") private WebElement womenclick ;
	
	@FindBy (xpath = "//a[@title='T-shirts'])[1]") private WebElement Tshirts ;
	
@FindBy (xpath = "//input[@class='search_query form-control ac_input']") private WebElement searchbar ;

WebDriver driver;

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	}
public void clickonlogo() {
	logo.click();
}
public void clickaddtocart() {
	addtocart.click();
	}

public void clickwoman() {
	womenclick.click();
	}

public void clickonTshirts() {
	Tshirts.click();
}
	
public void searchbar() {
	searchbar.sendKeys("dress");
}


	
	}


