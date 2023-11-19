package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Window;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_92 
{
@Test
public void Inamazon_canada_scrolldown() throws InterruptedException, AWTException
{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https:\\www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	WebElement canada=driver.findElement(By.linkText("Canada"));
	Point points=canada.getLocation();
	points.getX();
	int a=points.getY();
	//System.out.println(a);
	 JavascriptExecutor js = driver;
     js.executeScript("window.scrollBy(0, " + a + ");");
    // driver.close();
	
	
	
	
	
	
	
	
	
	
	/*Robot KMO= new Robot();
	
	for(int i=0;i<=a;i++)
	{
	//KMO.keyPress(KeyEvent.VK_PAGE_DOWN);
		KMO.mouseWheel(i);
	}*/
	Thread.sleep(5000);
	
	//driver.close();
}
}
