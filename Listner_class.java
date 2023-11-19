package Automation_Conceptwise;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listner_class implements ITestListener
{
ChromeDriver driver;
	@Override
	public void onTestStart(ITestResult result) 
	{
	
		ITestListener.super.onTestStart(result);
		Reporter.log("Test has Started");
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Test has Pass");
		//keep the code here for taking screenshot
		

		driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("book");
		search.sendKeys(Keys.ENTER);
		TakesScreenshot ts=driver;
		 	
			File source=ts.getScreenshotAs(OutputType.FILE);
			File destination=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\For_Screenshots\\passtestscreenshot.png");
			try {
				FileUtils.copyDirectory(source, destination);
			} catch (IOException e) {
				// TODO Auto-generated catch block	
				e.printStackTrace();
			}
		 	}
	
	
	

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		//keep the code here for every screenshot
		Reporter.log("Test has Fail");

		driver=new ChromeDriver();
	    driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("book");
		search.sendKeys(Keys.ENTER);
		TakesScreenshot ts=driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\For_Screenshots\\failtestscreenshot.png");
		try {
			FileUtils.copyDirectory(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
		


	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
		Reporter.log("test suit is started");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		Reporter.log("test suit is Finish");
	}
}
