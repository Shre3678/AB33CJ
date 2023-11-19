package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Assignment_81 
{
	@Test
	public void rightClick() throws InterruptedException
	{
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		driver.manage().window().maximize(); 
		WebDriverWait time= new WebDriverWait(driver, Duration.ofSeconds(10000));
		time.until(ExpectedConditions.titleIs("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!"));
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();// to close the login popup
  	   WebElement mobiles=driver.findElement(By.xpath("//div[.='Mobiles']"));
       Actions a = new Actions(driver);
       a.contextClick(mobiles).build().perform();			
       Thread.sleep(5000);
      //	driver.close();

	 }
}
	
