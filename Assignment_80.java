package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_80 
{
@Test
public void Co_ordiantes()
{
	WebDriver driver= new ChromeDriver();
	driver.get("https:\\www.google.com");
	driver.navigate().to("https:\\www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	WebElement Brazil=driver.findElement(By.linkText("Brazil"));
	Point a =Brazil.getLocation();
	System.out.println("The Co-Ordindates of Brazil "+a);
	
	
	driver.close();
	
	
}
}
