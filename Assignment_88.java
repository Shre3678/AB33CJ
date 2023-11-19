package Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Assignment_88
{
	@Test
public void Takingthescreenshotgooglehomepage() throws IOException
{
	ChromeDriver driver = new ChromeDriver();
	driver.navigate().to("https:\\www.google.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	TakesScreenshot takes= driver;
	File Source=takes.getScreenshotAs(OutputType.FILE);
	File location = new File("C:\\Users\\Lenovo\\eclipse-workspace\\Automation_MKT\\For_Screenshots\\GoogleHomepage.jpg");
FileUtils.copyFile(Source, location);
driver.close();
}
}
