package Automation_Conceptwise;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExpliciteWait 
{
@Test
public void EW()
{
	WebDriver driver = new FirefoxDriver();
	driver.navigate().to("https:\\www.google.com");
	WebElement SearchBox=driver.findElement(By.id("APjFqb"));
	
	WebDriverWait time= new WebDriverWait(driver, Duration.ofSeconds(10));
	time.until(ExpectedConditions.titleIs("Google"));
	
	SearchBox.sendKeys(".");
	SearchBox.sendKeys(Keys.ENTER);
    driver.close();
}
}
