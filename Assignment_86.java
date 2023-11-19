package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Assignment_86 
{
@Test
public void dropdowns() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:\\www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	Thread.sleep(50000);
	//List<WebElement> drop1=driver.findElements(By.tagName("select")); //1st approch to only find the no of dropdowns
	//int c=drop1.size();
	 //System.out.println(c);
	 WebElement drop=driver.findElement(By.tagName("select"));// 2nd approch to only 
		Select no= new Select(drop);
        List<WebElement>b=no.getOptions();
	   System.out.println(b.size());
	



}
}
