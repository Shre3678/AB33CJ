package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_85 
{
@Test
public void amazonlinks_print() throws InterruptedException
{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.amazon.in/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20000));
	Thread.sleep(30000);
	List<WebElement> a=driver.findElements(By.tagName("a"));
	System.out.println(a.size());
	for(int i=0;i<a.size();i++)
	{ 
		
		WebElement b=a.get(i);
		String links=b.getAttribute("href");
		System.out.println(links);
	}
	driver.close();
	
}
}
