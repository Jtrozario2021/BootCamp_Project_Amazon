package ProjectBootcamp3.Amazon;

import org.testng.annotations.Test;

import Common.Utility;
import PageObject.HomePage;
import PageObject.SearchResultPage;

import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterMethod;

public class CartTest {
	public WebDriver driver;
	
  @Test
  public void f() {
	  HomePage ob = new HomePage(Utility.driver);
	  ob.Srcfield();
	  ob.Srcbutton();
	  
	  SearchResultPage ob1 = new SearchResultPage(Utility.driver);
	  ob1.Itemclick();
	  ob1.AddtoCartbtn();
	  //ob1.PopUpOption();
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  //@BeforeTest
  public void beforeTest() {
	 String local = System.getProperty("user.dir");
	 System.setProperty("webdriver.chrome.driver", local+"\\src\\Driver\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.navigate().to("http://amazon.com");
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
  }

  //@AfterTest
  public void afterTest() throws InterruptedException {
	  Thread.sleep(10000);
	  driver.close();
  }
  
  public void shots() throws IOException {
	  Date dt=new Date();
	  System.out.println(dt);
	  String it=dt.toString().replace(" ", "_").replace(":","_");
	  System.out.println(it);
	  String local= System.getProperty("user.dir");
	 File stored= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(stored, new File(local+"\\Pictures\\"+it+"captured.jpg"));
  }


}
