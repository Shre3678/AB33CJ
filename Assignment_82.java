package Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Assignment_82 
{
@Test
public void Amazonwithrightclick() throws InterruptedException, IOException, AWTException
{
       ChromeDriver driver= new ChromeDriver();
       driver.navigate().to("https:\\www.amazon.in");
       driver.manage().window().maximize();
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
       driver.findElement(By.xpath("//div[@class=\"nav-left\"]/a/i")).click();
       //WebElement mobile=driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/ul[1]/li[15]/a"));
       WebElement mobile=driver.findElement(By.xpath("//div[.='Mobiles, Computers']"));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
       Actions for_rightclick = new Actions(driver);
       for_rightclick.contextClick(mobile).perform();
       Robot _Incongi = new Robot();
       _Incongi.keyPress(KeyEvent.VK_DOWN);
       _Incongi.keyPress(KeyEvent.VK_DOWN);
       _Incongi.keyPress(KeyEvent.VK_DOWN);
       Thread.sleep(5000);
       _Incongi.keyPress(KeyEvent.VK_ENTER);
       Thread.sleep(5000);
       TakesScreenshot ts= driver;
       File Source= ts.getScreenshotAs(OutputType.FILE);
       File location = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\For_Screenshots\\" +Math.random()+ ".png");
       FileUtils.copyFile(Source, location);
       //driver.quit();

}
	
}
