package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_93 
{
@Test
public void Scrolldown_ScreenShot() throws IOException, InterruptedException, AWTException
{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	WebElement canadaAddress=driver.findElement(By.linkText("Canada"));
	Point For_valuesof_canada=canadaAddress.getLocation();
	//int a=For_valuesof_canada.getX();
	int b=For_valuesof_canada.getY();
	//JavascriptExecutor jse =driver;
	//jse.executeScript("Window.scrollby(0, "+b+");");
	for(int i=0;i<=b;i++)
	{
		Robot keyboard_mouseOps= new Robot();
		keyboard_mouseOps.keyPress(KeyEvent.VK_PAGE_DOWN);
		
	}
	Thread.sleep(5000);
	TakesScreenshot screenshot=driver;
	File Source=screenshot.getScreenshotAs(OutputType.FILE);
	File destination= new File("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\For_Screenshots\\canandaSS.jpg");
	FileUtils.copyFile(Source, destination);
	Thread.sleep(5000);
}
}
