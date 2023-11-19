package Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_79 {

	@Test
	public void DoubleClick() throws InterruptedException
	{
	  WebDriver driver = new ChromeDriver();
	  driver.navigate().to("https:\\www.google.com");
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
	  WebElement Gmail_address=driver.findElement(By.xpath("//a[.='Images']"));
	  Actions double_click = new Actions(driver);
	  double_click.doubleClick(Gmail_address).perform();
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	//  driver.close();
	}
}
