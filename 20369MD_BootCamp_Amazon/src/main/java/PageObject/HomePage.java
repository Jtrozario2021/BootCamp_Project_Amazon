package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='twotabsearchtextbox']") WebElement SearchField;
	@FindBy(xpath = "//input[@id='nav-search-submit-button']") WebElement Searchbutton;
	
	
	
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
		
	public void Srcfield() {
		SearchField.sendKeys("headphones");
	}
	public void Srcbutton() {
		Searchbutton.click();
	}

}
