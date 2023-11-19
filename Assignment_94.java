package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_94 
{
@Test
public void Facebooklogin_usingCSSSelectors() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	WebElement username=driver.findElement(By.cssSelector("input#email"));
	username.click();
	username.sendKeys("9912123678");
	WebElement password =driver.findElement(By.cssSelector("input#pass"));
	password.click();
	password.sendKeys("Shre$56789");
	driver.findElement(By.cssSelector("button[name=login]")).click();
	Thread.sleep(5000);
	driver.close();
}
}
