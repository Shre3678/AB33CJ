package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_91 
{
@Test
public void infinitetime_scrolldown() throws AWTException
{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https:\\www.youtube.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	for(int i=128;i>-128;i++)
	{
	
  Robot scrolldown= new Robot();
	scrolldown.mouseWheel(i);
	//	Robot pagedown= new Robot();
		//pagedown.keyPress(KeyEvent.VK_PAGE_DOWN);
	}
	
}
		
}
