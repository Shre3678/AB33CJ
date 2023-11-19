package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class Assignment_96 
{
@Test
public void assertion_concept()
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
	
}
}
