package Automation_Conceptwise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScreenShot 
{
@Test
public void Screenshot() throws IOException
{
	ChromeDriver driver= new ChromeDriver();
	driver.navigate().to("https://www.google.com");
	driver.manage().window().maximize();
	//below 4 lines of code for take a screenshot 
	TakesScreenshot ts=driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	
	File destination = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\For_Screenshots\\Google1.jpg");
	FileUtils.copyFile(Source, destination);
	driver.close();

}
}
