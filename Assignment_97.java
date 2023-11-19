package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.asserts.Assertion;

public class Assignment_97 implements IRetryAnalyzer
{

	int count =0;
	int retrycount =5;
	@Override
	public boolean retry(ITestResult result) 
	{
	if(count<retrycount)
	{
		count++;
		return true;
	}
		return false;
	}
	


public void Iretryanalyzer_concept()

{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https:\\www.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	driver.findElement(By.cssSelector("input#email")).sendKeys("9912123678");
	driver.findElement(By.cssSelector("input#pass")).sendKeys("Shre$56789");
	driver.findElement(By.cssSelector("button[name=login]")).click();
Assertion a = new Assertion();
a.assertEquals("https://www.facebook.com/", "d");
driver.close();
	
}
}
