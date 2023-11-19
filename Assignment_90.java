package Assignments;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_90 
{
@Test
public void Secure_JavaScript_popup() throws InterruptedException
{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https://srinivasshetty@gmail.com.Shre$56789@www.facebook.in");
	Thread.sleep(5000);
	driver.close();
}
}
