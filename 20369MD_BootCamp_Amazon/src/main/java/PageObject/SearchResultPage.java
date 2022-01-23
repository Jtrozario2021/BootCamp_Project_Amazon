package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchResultPage {
	public WebDriver driver;

	@FindBy(xpath = "//span[contains(text(),'Sony ZX Series Wired On-Ear Headphones, Black MDR-')]") WebElement Item;
	@FindBy(xpath = "//input[@id='add-to-cart-button']") WebElement AddtoCart;
	//@FindBy(xpath = "//span[@id='attach-sidesheet-view-cart-button']") WebElement Popup;
	
	
	
	

	public SearchResultPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void Itemclick() {
		Item.click();
	}
	public void AddtoCartbtn() {
		AddtoCart.click();
	}
	//public void PopUpOption()  {
		//Popup.click();
		
		//}
}
