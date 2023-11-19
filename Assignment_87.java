package Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_87 
{
	@Test
	public void SC_Printing() throws InterruptedException
	{
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https:\\www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	Thread.sleep(50000);
	List<WebElement>find= driver.findElements(By.tagName("select"));
	int a = find.size();
	System.out.println(find.size());
	for(int i=0;i<a;i++)
	{
		WebElement c=find.get(i);
		String dropdowlist=c.getText();
		System.out.println(dropdowlist);
	}
	driver.close();	
	}

}
