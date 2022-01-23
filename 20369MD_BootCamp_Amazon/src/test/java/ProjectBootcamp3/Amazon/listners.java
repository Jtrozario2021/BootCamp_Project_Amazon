package ProjectBootcamp3.Amazon;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;


import Common.Utility;

public class listners extends Utility implements ITestListener {
	public WebDriver driver;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("Test Is Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		this.driver=Utility.driver;
		 Date dt=new Date();
		  System.out.println(dt);
		  String it=dt.toString().replace(" ", "_").replace(":","_");
		  System.out.println(it);
		  String local= System.getProperty("user.dir");
		 File stored= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 try {
			FileHandler.copy(stored, new File(local+"\\Pictures\\Pass\\"+it+"captured.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
		
	