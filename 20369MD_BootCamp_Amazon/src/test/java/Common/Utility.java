package Common;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import ProjectBootcamp3.Amazon.CartTest;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterTest;


public class Utility extends CartTest {
	public static WebDriver driver;
	 @Parameters({"browser","wbsite"}) 
	 @BeforeTest
	  public void beforeTest(String browser,String wbsite) {
		  String local= System.getProperty("user.dir");
		  		System.setProperty("webdriver.chrome.driver", local+"\\src\\Driver\\chromedriver.exe");
				     driver=new ChromeDriver();
				     driver.navigate().to(wbsite);
				      driver.manage().window().maximize();
		
	  }

	  @AfterTest
	  public void afterTest() throws InterruptedException {
		  Thread.sleep(6000);
		  driver.quit();
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
