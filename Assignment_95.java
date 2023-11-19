package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_95 
{
	@Test
public void amazonpage_scrolldown() throws AWTException, InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	
	for(int i=0;i<=10;i++)
	{
		Robot keyboard_mouseOps= new Robot();
		keyboard_mouseOps.keyPress(KeyEvent.VK_PAGE_DOWN);
		
}
	Thread.sleep(5000);
	driver.close();
}
}
