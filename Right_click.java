package Automation_Conceptwise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
  
public class Right_click {
    @Test    
	public void google_q() throws InterruptedException
	{
		
	
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.navigate().to("https://www.google.com");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	WebElement Gmail = driver.findElement(By.linkText("Gmail"));
	//Gmail.click();
    
    Actions for_rightClick = new Actions(driver);
    for_rightClick.contextClick(Gmail).build().perform();
    Thread.sleep(5000);
    driver.close();
}
}