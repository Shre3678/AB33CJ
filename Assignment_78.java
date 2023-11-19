package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_78 
{
@Test (timeOut=15000)
public void TO()
{
	WebDriver driver =new ChromeDriver();
	driver.navigate().to("https:\\www.google.com");
	
	
}
}
