package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_83 
{
@Test
public void textclearing() throws InterruptedException
{
	WebDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	WebElement Search=driver.findElement(By.name("q"));
	Search.click();
    Search.sendKeys("India");
    Thread.sleep(5000);
    //Search.clear();
    Search.sendKeys(Keys.CONTROL+ "a");
    Search.sendKeys(Keys.BACK_SPACE);
    Thread.sleep(5000);
    //driver.close();
}
}
